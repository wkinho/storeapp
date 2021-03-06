package com.store.storeapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.store.storeapp.Utils;
import com.store.storeapp.models.Customer;
import com.store.storeapp.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private Utils utilM;
	
	@CrossOrigin
	@GetMapping("/customer")
	public ResponseEntity<List<?>> getAllCustomer(){
		List<Customer> allCustomer = customerService.getAllCustomer();
		return utilM.getAll(allCustomer);
	}
	
	@CrossOrigin
	@GetMapping("/customer/{id}")
	public ResponseEntity<Optional<?>> getOneCustomer(@PathVariable Long id){
		Optional<Customer> customer = customerService.getOneCustomer(id);
		return utilM.getOne(customer);
	}
	
	@CrossOrigin
	@ResponseStatus(HttpStatus.OK)
	@PostMapping("/customer/post")
	public void setCustomer(@RequestBody Customer customer) {
		customerService.setCustomer(customer);
	}
	
	@CrossOrigin
	@PutMapping("/customer/{id}")
	public ResponseEntity<Optional<?>> updateCustomer(@RequestBody Customer update, @PathVariable Long id) {
		Optional<Customer> customer = customerService.updateCustomer(update, id);
		return utilM.update(customer);
	}
	
	@CrossOrigin
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable Long id) {
		boolean customer = customerService.deleteCustomer(id);
		return utilM.delete(customer);
	}
}
