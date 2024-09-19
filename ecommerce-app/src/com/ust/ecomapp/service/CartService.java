package com.ust.ecomapp.service;

import com.ust.ecomapp.model.Product;

public interface CartService {

    public void addToCart(int id);

    public void getCartItems();

    public double calculateTotalPrice();

    public void applyDiscounts();

    public void addToProducts(Product newProduct);

    public void showProducts();
    public void findById(int id)throws Exception;

}
