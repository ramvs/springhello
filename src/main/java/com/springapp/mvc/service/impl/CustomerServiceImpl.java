package com.springapp.mvc.service.impl;

import com.springapp.mvc.domain.Customer;
import com.springapp.mvc.repository.CustomerRepository;
import com.springapp.mvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Krystian on 2015-10-13.
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;


    public List<Customer> getAllCustomers() {
      return customerRepository.getAllCustomers();
    }
}
