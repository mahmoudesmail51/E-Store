package com.Estore.Project.services;

import com.Estore.Project.ApiResponse;
import com.Estore.Project.models.Customer;
import com.Estore.Project.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

         private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public ApiResponse RegisterCustomer(Customer customer)
    {
        //Signed-in token enabled
       customerRepository.save(customer);
       return new ApiResponse(200,"success",customer);
    }




}
