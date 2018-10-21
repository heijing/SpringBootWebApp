package com.javasampleapproach.jqueryajax.dao;

import com.javasampleapproach.jqueryajax.model.Customer;

import javax.sql.DataSource;
import java.util.List;

public interface CustomerDao {
    public List<Customer> listUserByName(String name);

    public boolean create(Customer customer);

    public Customer getCustomer(Integer id);

    public List<Customer> getAllCustomers();

    public boolean delete(int id);

    public boolean update(Customer customer);

    public void cleanup();
}
