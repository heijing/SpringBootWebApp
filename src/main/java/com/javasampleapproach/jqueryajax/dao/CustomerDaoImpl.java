package com.javasampleapproach.jqueryajax.dao;

import com.javasampleapproach.jqueryajax.model.Customer;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    public CustomerDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Customer> listUserByName(String name) {
        return null;
    }

    @Override
    public boolean create(Customer customer) {
        String sqlQuery = "INSERT INTO customer(firstname,lastname)"+"VALUE(?,?)";
        Object[] args = new Object[]{customer.getFirstname(),customer.getLastname()};
        return jdbcTemplate.update(sqlQuery, args) == 1;
    }

    @Override
    public Customer getCustomer(Integer id) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        String sqlQuery = "SELECT * FROM customer";
        List<Customer> customerList = jdbcTemplate.query(sqlQuery,new CustomerRowMapper());
        return customerList;
    }

    @Override
    public boolean delete(int id) {
//        String sqlQuery = "DELETE FROM customer where id = ?";
//        Object[] args = new Object[]{id};
//        return jdbcTemplate.update(sqlQuery, args) == 1;
        String deleteSql = "DELETE FROM customer WHERE id = ?";
        Object[] params = { id };
        return jdbcTemplate.update(deleteSql,params) == 1;

    }

    @Override
    public boolean update(Customer customer){
        SqlParameterSource beanParams = new BeanPropertySqlParameterSource(customer);
        String sql = "UPDATE customer SET firstname = :firstname WHERE id = :id ";
        return namedParameterJdbcTemplate.update(sql,beanParams) == 1;
    }

    @Override
    public void cleanup() {

    }
}
