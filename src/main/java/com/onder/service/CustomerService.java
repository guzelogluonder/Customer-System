package com.onder.service;

import com.onder.model.Customer;

public interface CustomerService {
    Customer getCustomerById(Long customerId);
    Customer createCustomer(Customer customer);
}
