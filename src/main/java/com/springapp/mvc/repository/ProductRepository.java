package com.springapp.mvc.repository;

import com.springapp.mvc.domain.Product;

import java.util.List;

/**
 * Created by Krystian on 2015-10-12.
 */
public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(String productID); //TODO
}
