package com.springapp.mvc.repository.impl;

import com.springapp.mvc.domain.Customer;
import com.springapp.mvc.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krystian on 2015-10-13.
 */
@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    private List<Customer> listOfCustomers = new ArrayList<Customer>();

    public InMemoryCustomerRepository() {
        Customer firstCustomer = new Customer("1", "Adam Nowak", "1");
        Customer secondCustomer = new Customer("2", "Adam Mickiewicz", "2");
        Customer thirdCustomer = new Customer("3", "Krystian Kawa", "3");
        listOfCustomers.add(firstCustomer);
        listOfCustomers.add(secondCustomer);
        listOfCustomers.add(thirdCustomer);
    }

    public List<Customer> getAllCustomers() {
        return listOfCustomers;
    }


    public Customer getCustomerById(String customerId) {
        Customer customerById = null;
        for (Customer customer : listOfCustomers) {
            if (customer != null && customer.getCustomerId() != null &&
                    customer.getCustomerId().equals(customerId)) {
                customerById = customer;
                break;
            }
        }
        if (customerById == null) {
            throw new IllegalArgumentException("No product found with the product" +
                    "id" + customerId);
        }
        return customerById;
    }

}

