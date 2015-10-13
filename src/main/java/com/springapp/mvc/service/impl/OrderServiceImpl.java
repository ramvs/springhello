package com.springapp.mvc.service.impl;

import com.springapp.mvc.domain.Product;
import com.springapp.mvc.repository.ProductRepository;
import com.springapp.mvc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Krystian on 2015-10-13.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductRepository productRepository;
    public void processOrder(String productId, long quantity) {
        Product productById = productRepository.getProductById(productId);
        if(productById.getUnitsInStock() < quantity){
            throw new IllegalArgumentException("Out of Stock. Available" +
                    "Units in stock" + productById.getUnitsInStock());
        }
        productById.setUnitsInStock(productById.getUnitsInStock()-quantity);
    }
}
