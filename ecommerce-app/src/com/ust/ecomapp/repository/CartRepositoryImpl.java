package com.ust.ecomapp.repository;

import com.ust.ecomapp.model.Product;
import com.ust.ecomapp.userdefinedexception.ProductNotFoundException;

public class CartRepositoryImpl implements CartRepository {

    private Product []products = new Product[10];
    int currentIndex = 0;


    public void addProduct(Product product) {

        products[currentIndex]=product;
        currentIndex++;

    }

    public Product[] getAllProducts() {
        return products;
    }
}
