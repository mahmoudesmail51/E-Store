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
       return new ApiResponse(200,"Registered Successfully",customer);
    }

    @Override
    public ApiResponse customerLogIn(String username, String password) {
        List<Customer> customers = customerRepository.findByUsername(username);
        if (customers.size()==1)
        {
            if (customers.get(0).getPassword().equals(password))
            {
                customers.get(0).setLoggedIn(true);
                return new ApiResponse(200,"Logged in Successfully",customers.get(0));
            }
            else
                return new ApiResponse(0,"Wrong Password",null);
        }
        else
        {
            return new ApiResponse(200,"Username Not Found",null);
        }
    }
}
