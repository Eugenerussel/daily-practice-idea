package com.ust.ecomapp.repository;

import com.ust.ecomapp.model.Product;
import com.ust.ecomapp.userdefinedexception.ProductNotFoundException;

public class ProductRepoImplementation implements ProductRepo{

    Product []  availableProducts = new Product[20];
    public int totalProducts = 0;


    public void addProduct(Product newProduct) {
        availableProducts[totalProducts++]=newProduct;
    }

    public Product [] showProducts() {
        return availableProducts;
    }
}
