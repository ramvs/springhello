package com.springapp.mvc.repository;

import com.springapp.mvc.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Krystian on 2015-10-12.
 */
public interface ProductRepository {
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    Product getProductById(String productID);
    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
}
