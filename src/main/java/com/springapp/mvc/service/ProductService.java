package com.springapp.mvc.service;

import com.springapp.mvc.domain.Product;
import com.springapp.mvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Krystian on 2015-10-13.
 */
public interface ProductService {
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByManufacturer(String manufacturer);
    List<Product> getProductsByPriceFilter(BigDecimal low, BigDecimal high);
    Product getProductById(String productID);
    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);

    void addProduct(Product product);
}
