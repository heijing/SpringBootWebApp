package com.javasampleapproach.jqueryajax.controller;

import java.util.ArrayList;
import java.util.List;

import com.javasampleapproach.jqueryajax.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.javasampleapproach.jqueryajax.message.Response;
import com.javasampleapproach.jqueryajax.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class RestWebController {

	List<Customer> cust = new ArrayList<Customer>();
	@Autowired
	CustomerService customerService;

	@GetMapping(value = "/all")
	public Response getAllCustomers() {
		cust = customerService.getAllCustomers();
		Response response = new Response("Done", cust);
		return response;
	}

	@PostMapping(value = "/save")
	public Response postCustomer(@RequestBody Customer customer) {
		boolean created = customerService.createCustomer(customer);
		if(created){
			Response response = new Response("Done", customer);
			return response;
		}
		else{
			return new Response("Error",customer);
		}
	}
	@DeleteMapping(value = "/{id:.+}")
	public Response deleteCustomer(@PathVariable int id){
		boolean deleted = customerService.deleteCustomer(id);
		if(deleted){
			Response response = new Response("Done", id);
			return response;
		}
		else{
			return new Response("Error",id);
		}

	}
}