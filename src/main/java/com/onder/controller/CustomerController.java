package com.onder.controller;

import com.onder.model.Customer;
import com.onder.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController{
private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable long id){
        return ResponseEntity.ok().body(customerService.getCustomerById(id));
    }
    @PostMapping("/customers")
    public ResponseEntity<Customer> createAirline(@RequestBody Customer customer) {
        return ResponseEntity.ok().body(this.customerService.createCustomer(customer));
    }
}
