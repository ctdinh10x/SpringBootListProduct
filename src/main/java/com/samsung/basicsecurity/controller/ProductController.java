package com.samsung.basicsecurity.controller;

import com.samsung.basicsecurity.repositories.models.Product;
import com.samsung.basicsecurity.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/home/product")
    public String product(final Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("listProducts", products);
        return "ShoppingCarts";
    }
}
