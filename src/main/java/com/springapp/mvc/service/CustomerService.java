package com.springapp.mvc.service;

import com.springapp.mvc.domain.Customer;

import java.util.List;

/**
 * Created by Krystian on 2015-10-13.
 */
public interface CustomerService {
    List<Customer> getAllCustomers();
}
