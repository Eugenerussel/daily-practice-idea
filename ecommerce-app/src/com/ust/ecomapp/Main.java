package com.ust.ecomapp;

import com.ust.ecomapp.model.Clothing;
import com.ust.ecomapp.model.Electronics;
import com.ust.ecomapp.model.Product;
import com.ust.ecomapp.model.Size;
import com.ust.ecomapp.service.CartService;
import com.ust.ecomapp.service.CartServiceImpl;
import com.ust.ecomapp.userdefinedexception.InvalidInputException;
import com.ust.ecomapp.userdefinedexception.ProductNotFoundException;

import java.util.Scanner;

import static com.ust.ecomapp.model.Size.LARGE;
import static com.ust.ecomapp.model.Size.X_LARGE;

public class Main {
    public static void main(String[] args){

        CartService cartService = new CartServiceImpl();
        cartService.addToProducts(new Electronics(23, "iPhone", 96000, 12, 4, "Apple"));
        cartService.addToProducts(new Electronics(10, "Tablet", 75000, 5, 12, "Samsung"));
        cartService.addToProducts(new Electronics(17, "Washing Machine", 25000, 30, 24, "LG"));
        cartService.addToProducts(new Clothing(44, "T-Shirt", 1500, 90, LARGE, "Cotton"));
        cartService.addToProducts(new Clothing(92, "Jeans", 2000, 15, X_LARGE, "Polyester"));


        while (1 > 0) {
            System.out.println("""
                       
                                
                                
                    - Welcome to My Shopping App
                    - Select an Option
                    1: View All Products
                    2: Add Product to Cart
                    3: View Cart
                    4: Find by id
                    Enter 0 to exit""");
                    
            Scanner read = new Scanner(System.in);
            int n = read.nextInt();

            if (n == 1) {
                cartService.showProducts();
            } else if (n == 2) {
                System.out.println("Please enter the ProductID");
                int id = read.nextInt();
                if(id<0){
                    throw new InvalidInputException("Invalid id");
                }
                else {
                    cartService.addToCart(id);
                }
            } else if (n == 3) {
                cartService.getCartItems();
            } else if(n==4){
                System.out.println("Please enter the ProductID");
                int id = read.nextInt();
                try {
                    cartService.findById(id);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            else{
                break;
            }
        }
        System.out.println("total price: "+cartService.calculateTotalPrice());
        cartService.applyDiscounts();
        System.out.println("Total price after applying dicount: "+cartService.calculateTotalPrice());

    }
}


