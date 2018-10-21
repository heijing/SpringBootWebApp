package com.javasampleapproach.jqueryajax.Service;

import com.javasampleapproach.jqueryajax.dao.CustomerDao;
import com.javasampleapproach.jqueryajax.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    @Override
    public boolean createCustomer(Customer customer) {
        return customerDao.create(customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return customerDao.delete(id);
    }

    @Autowired
    CustomerDao customerDao;
}
