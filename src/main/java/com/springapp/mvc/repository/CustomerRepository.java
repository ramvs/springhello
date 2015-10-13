package com.springapp.mvc.repository;

import com.springapp.mvc.domain.Customer;

import java.util.List;

/**
 * Created by Krystian on 2015-10-13.
 */
public interface CustomerRepository {
    List<Customer> getAllCustomers();
    Customer getCustomerById(String customerId);
}
