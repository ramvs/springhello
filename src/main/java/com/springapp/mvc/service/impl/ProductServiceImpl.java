package com.springapp.mvc.service.impl;

import com.springapp.mvc.domain.Product;
import com.springapp.mvc.repository.ProductRepository;
import com.springapp.mvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Krystian on 2015-10-13.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRespository;
    public List<Product> getAllProducts() {
        return productRespository.getAllProducts();
    }
    public List<Product> getProductsByCategory(String category){
        return productRespository.getProductsByCategory(category);}

    public Product getProductById(String productID) {
        return productRespository.getProductById(productID);
    }

    public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
        return productRespository.getProductsByFilter(filterParams);
    }
}
