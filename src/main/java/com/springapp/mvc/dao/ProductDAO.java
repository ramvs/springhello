package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Product;

import java.util.List;

/**
 * Created by Krystian on 2015-10-31.
 */

public interface ProductDAO {

    public void addProduct(Product p);
    public void updateProduct(Product p);
    public List<Product> listProducts();
    public Product getProductById(int id);
    public void removeProduct(int id);
}