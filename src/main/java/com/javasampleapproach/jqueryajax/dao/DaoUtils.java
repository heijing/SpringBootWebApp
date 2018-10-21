package com.javasampleapproach.jqueryajax.dao;

import com.javasampleapproach.jqueryajax.model.Customer;

import java.util.List;

public class DaoUtils {
    public static final String createOperation = "CREATE";
    public static final String readOperation = "READ";
    public static final String updateOperation = "UPDATE";
    public static final String deleteOperation = "DELETE";
    public static final String cleanupOperation = "TRUNCATE";

    public static void printOrganizations(List<Customer> customers, String operation){
        System.out.println("\n********* printing customers after " + operation + " operation *********");
        for (Customer cus : customers) {
            System.out.println(cus);
        }
    }

    public static void printSuccessFailure(String operation, boolean param){
        if(param)
            System.out.println("\nOperation " + operation + " successful");
        else
            System.out.println("\nOperation " + operation + " failed");
    }

    public static void createSeedData(Customer dao){
        Customer org1 = new Customer("hello", "world");

    }

    public static void printOrganizationCount(List orgs, String operation){
        System.out.println("\n*********Currently we have " + orgs.size()+ " organizations after " + operation + " operation" + " *********");

    }


}
