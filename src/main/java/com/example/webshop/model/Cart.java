package com.example.webshop.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products = new ArrayList<>();

    // Add product to cart
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove product from cart
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Get all products in cart
    public List<Product> getProducts() {
        return products;
    }

    // Clear the cart
    public void clearCart() {
        products.clear();
    }
}
