package com.ust.ecomapp.repository;
import com.ust.ecomapp.model.Product;
import com.ust.ecomapp.userdefinedexception.ProductNotFoundException;

public interface ProductRepo {
    Product[] showProducts();
    void addProduct(Product p);
}
