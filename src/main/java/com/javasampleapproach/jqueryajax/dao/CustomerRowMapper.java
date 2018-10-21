package com.javasampleapproach.jqueryajax.dao;

import com.javasampleapproach.jqueryajax.model.Customer;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<Customer> {


    @Override
    public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
        Customer cus = new Customer();
        cus.setId(resultSet.getInt("id"));
        cus.setFirstname(resultSet.getString("firstname"));
        cus.setLastname(resultSet.getString("lastname"));
        return cus;
    }
}
