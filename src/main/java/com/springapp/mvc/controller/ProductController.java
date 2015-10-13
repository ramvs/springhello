package com.springapp.mvc.controller;

import com.springapp.mvc.domain.Product;
import com.springapp.mvc.repository.ProductRepository;
import com.springapp.mvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

/**
 * Created by Krystian on 2015-10-12.
 */
@Controller
public class ProductController{
    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public String list(Model model) {
//        Product iphone = new Product("P1234","iPhone 5s", new BigDecimal(500));
//        iphone.setDescription("Apple iPhone 5s smartphone with 4.00 - inch" +
//                "640x1136 display and 8-megapixel rear camera");
//        iphone.setCategory("Smart Phone");
//        iphone.setManufacturer("Apple");
//        iphone.setUnitsInStock(1000);
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }
}
