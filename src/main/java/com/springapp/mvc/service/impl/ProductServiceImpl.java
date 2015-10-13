package com.springapp.mvc.service.impl;

import com.springapp.mvc.domain.Product;
import com.springapp.mvc.repository.ProductRepository;
import com.springapp.mvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
