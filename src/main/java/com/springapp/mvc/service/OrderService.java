package com.springapp.mvc.service;

/**
 * Created by Krystian on 2015-10-13.
 */
public interface OrderService {
    void processOrder(String productId, long quantity);
}
