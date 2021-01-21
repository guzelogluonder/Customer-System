package com.onder.service;

import com.onder.Exception.ResourceNotFoundException;
import com.onder.Repository.CustomerRepository;
import com.onder.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

@Autowired
    private CustomerRepository customerRepository;



    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getCustomerById(Long customerId) {

        Optional<Customer> customerDb = this.customerRepository.findById(customerId);
        if(customerDb.isPresent()){
            return customerDb.get();
        }else{
            throw new ResourceNotFoundException("Customer not found with id: " + customerDb);

        }
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
