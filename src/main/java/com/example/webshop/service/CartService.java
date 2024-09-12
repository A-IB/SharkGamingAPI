package com.example.webshop.service;

import com.example.webshop.model.Cart;
import com.example.webshop.model.Product;
import com.example.webshop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    private final Cart cart = new Cart(); // In-memory cart

    private final ProductRepository productRepository;

    public CartService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProductToCart(Long productId) {
        Optional<Product> product = productRepository.findById(productId);
        product.ifPresent(cart::addProduct);
    }

    public void removeProductFromCart(Long productId) {
        Optional<Product> product = productRepository.findById(productId);
        product.ifPresent(cart::removeProduct);
    }

    public Cart getCart() {
        return cart;
    }

    public void clearCart() {
        cart.clearCart();
    }
}
