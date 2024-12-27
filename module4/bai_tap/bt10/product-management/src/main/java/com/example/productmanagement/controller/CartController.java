package com.example.productmanagement.controller;

import com.example.productmanagement.model.CartItem;
import com.example.productmanagement.model.Product;
import com.example.productmanagement.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/cart")
@SessionAttributes("cartItem")
public class CartController {
    @Autowired
    private IProductService productService;
    @ModelAttribute("cartItem")
    public CartItem setupCart() {
        return new CartItem();
    }

    @PostMapping("/add")
    public String addToCart(@RequestParam("productId") Integer productId,
                            @ModelAttribute("cartItem") CartItem cartItem,
                            RedirectAttributes redirectAttributes) {
        Product product = productService.findById(productId);
        if (product != null) {
            cartItem.addProduct(product);
            redirectAttributes.addFlashAttribute("message", "Product added to cart successfully!");
        } else {
            redirectAttributes.addFlashAttribute("error", "Product not found!");
        }
        return "redirect:/products";
    }


    @GetMapping("")
    public String viewCart(@ModelAttribute("cartItem") CartItem cartItem, Model model) {
        model.addAttribute("cart", cartItem);
        return "cart";
    }
    @PostMapping("/increment")
    public String incrementProduct(@RequestParam("productId") Integer productId,
                                   @ModelAttribute("cartItem") CartItem cartItem) {
        Product product = productService.findById(productId);
        if (product != null) {
            cartItem.incrementProductQuantity(product);
        }
        return "redirect:/cart";
    }
    @PostMapping("/decrement")
    public String decrementProduct(@RequestParam("productId") Integer productId,
                                   @ModelAttribute("cartItem") CartItem cartItem) {
        Product product = productService.findById(productId);
        if (product != null) {
            cartItem.decrementProductQuantity(product);
        }
        return "redirect:/cart";
    }

    @PostMapping("/remove")
    public String removeProduct(@RequestParam("productId") Integer productId,
                                @ModelAttribute("cartItem") CartItem cartItem,
                                RedirectAttributes redirectAttributes) {
        Product product = productService.findById(productId);
        if (product != null) {
            cartItem.removeProduct(product);
            redirectAttributes.addFlashAttribute("message", "Product removed from cart successfully!");
        } else {
            redirectAttributes.addFlashAttribute("error", "Failed to remove product: Product not found!");
        }
        return "redirect:/cart";
    }


}