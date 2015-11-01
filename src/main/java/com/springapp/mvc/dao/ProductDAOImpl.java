package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Product;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Krystian on 2015-11-01.
 */
public class ProductDAOImpl implements ProductDAO {
    private SessionFactory sessionFactory;

    public ProductDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addProduct(Product p) {

    }

    @Override
    public void updateProduct(Product p) {

    }

    @Override
    public List<Product> listProducts() {
        return null;
    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public void removeProduct(int id) {

    }
}
