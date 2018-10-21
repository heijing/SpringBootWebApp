package com.javasampleapproach.jqueryajax.model;

public class Customer {
    private String firstname;
    private String lastname;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer(){}
     
    public Customer(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
     
    // firstname
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
     
    // lastname
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}