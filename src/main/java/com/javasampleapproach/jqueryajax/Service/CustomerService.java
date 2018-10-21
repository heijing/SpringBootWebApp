package com.javasampleapproach.jqueryajax.Service;

import com.javasampleapproach.jqueryajax.model.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getAllCustomers();

    public boolean createCustomer(Customer customer);

    public boolean deleteCustomer(int id);
}

