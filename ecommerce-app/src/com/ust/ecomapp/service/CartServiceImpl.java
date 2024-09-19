package com.ust.ecomapp.service;

import com.ust.ecomapp.model.Clothing;
import com.ust.ecomapp.model.Electronics;
import com.ust.ecomapp.model.Product;
import com.ust.ecomapp.repository.CartRepository;
import com.ust.ecomapp.repository.CartRepositoryImpl;
import com.ust.ecomapp.repository.ProductRepo;
import com.ust.ecomapp.repository.ProductRepoImplementation;
import com.ust.ecomapp.userdefinedexception.InvalidInputException;
import com.ust.ecomapp.userdefinedexception.ProductNotFoundException;

public class CartServiceImpl implements CartService{

    private CartRepository cartRepo = new CartRepositoryImpl();
    private ProductRepo productRepo = new ProductRepoImplementation();

    public void addToCart(int id) {
        Product[] products = productRepo.showProducts();
        for(Product p:products){
            if(p!=null&&p.getProductId()==id){
                cartRepo.addProduct(p);
            }
        }
    }
    public void findById(int id)throws ProductNotFoundException {
        Product[] availableProducts = productRepo.showProducts();
        boolean isPresent = false;
        for (Product p : availableProducts) {
            if (p == null) {
                break;
            } else if (p.getProductId() == id) {
                System.out.println("Product name: " + p.getProductName());
                isPresent = true;
                break;
            }
        }
        if (!isPresent) {
            throw new ProductNotFoundException("Product id not found");
        }
    }

    public void getCartItems() {
        Product[] products= cartRepo.getAllProducts();
        for(Product p: products){
            if(p!=null){
                System.out.println("Product Name: "+p.getProductName());
                System.out.println("Product Price: "+p.getPrice());
                System.out.println("Product ID: "+p.getProductId());
                System.out.println("");
            }
        }
    }

    public double calculateTotalPrice() {
        Product[] products = cartRepo.getAllProducts();
        double total = 0;
        for (Product p:products){
            if (p==null){
                break;
            }
            total+=p.getPrice();
        }
        return total;
    }

    public void applyDiscounts() {
        Product[] products = cartRepo.getAllProducts();
        for (Product p:products){
            if (p==null){
                break;
            }
            if (p instanceof Electronics){
                double price = p.getPrice();
                price = price - price*.10;
                p.setPrice(price);
            } else if (p instanceof Clothing) {
                double price = p.getPrice();
                price = price - price*.20;
                p.setPrice(price);
            }
        }
    }

    public void addToProducts(Product newProduct) {
        if (newProduct.getProductName() == null) {
            throw new InvalidInputException("Invalid name");
        }
        else if(newProduct.getPrice()<0){
            throw new InvalidInputException("Invalid price");

        }else {
            productRepo.addProduct(newProduct);
        }
    }

    public void showProducts(){
        Product[] products= productRepo.showProducts();
        for(Product p: products){
            if(p!=null){
                System.out.println(p.getProductId()+": Product Name: "+p.getProductName());
            }
        }
    }

}
