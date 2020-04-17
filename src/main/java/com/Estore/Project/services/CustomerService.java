package com.Estore.Project.services;

import com.Estore.Project.ApiResponse;
import com.Estore.Project.models.Customer;


import java.util.List;

public interface CustomerService
{
    ApiResponse RegisterCustomer(Customer customer);

    ApiResponse customerLogIn (String username, String password);



}
