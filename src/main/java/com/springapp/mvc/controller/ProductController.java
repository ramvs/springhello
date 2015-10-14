package com.springapp.mvc.controller;

import com.springapp.mvc.domain.Product;
import com.springapp.mvc.repository.ProductRepository;
import com.springapp.mvc.service.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Krystian on 2015-10-12.
 */
@Controller
@RequestMapping("/products")
public class ProductController{
    @Autowired
    private ProductService productService;

    @RequestMapping
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
    @RequestMapping("/all")
    public String allProducts(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/{category}")
    public  String getProductsByCategory(Model model,@PathVariable("category") String productCategory){
        model.addAttribute("products",productService.getProductsByCategory(productCategory));
        return "products";
    }
    @RequestMapping("/price")
    public String getProductsByPrice(@RequestParam("low") BigDecimal low, @RequestParam("high") BigDecimal high, Model model){
        model.addAttribute("products", productService.getProductsByPriceFilter(low, high));
        return "products";
    }
    @RequestMapping("/filter/{ByCriteria}")
    public String getProductsByFilter(@MatrixVariable(pathVar=
            "ByCriteria") Map<String,List<String>> filterParams,Model model) {
        model.addAttribute("products",
                productService.getProductsByFilter(filterParams));
        return "products";
    }

    @RequestMapping("/product")
    public String getProductById(@RequestParam("id") String productId, Model model){
        model.addAttribute("product",productService.getProductById(productId));
        return "product";
    }


}
