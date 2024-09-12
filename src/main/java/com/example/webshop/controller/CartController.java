package com.example.webshop.controller;

import com.example.webshop.model.Cart;
import com.example.webshop.service.CartService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    // Add product to cart
    @PostMapping("/add/{productId}")
    public void addProductToCart(@PathVariable Long productId) {
        cartService.addProductToCart(productId);
    }

    // Remove product from cart
    @DeleteMapping("/remove/{productId}")
    public void removeProductFromCart(@PathVariable Long productId) {
        cartService.removeProductFromCart(productId);
    }

    // Get all products in the cart
    @GetMapping
    public Cart getCart() {
        return cartService.getCart();
    }

    // Clear the cart
    @DeleteMapping("/clear")
    public void clearCart() {
        cartService.clearCart();
    }
}
