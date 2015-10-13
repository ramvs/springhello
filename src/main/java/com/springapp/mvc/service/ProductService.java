package com.springapp.mvc.service;

import com.springapp.mvc.domain.Product;
import com.springapp.mvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Krystian on 2015-10-13.
 */
public interface ProductService {
    List<Product> getAllProducts();
}
