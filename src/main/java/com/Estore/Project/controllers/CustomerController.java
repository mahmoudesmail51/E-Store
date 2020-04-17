package com.Estore.Project.controllers;

import com.Estore.Project.ApiResponse;
import com.Estore.Project.models.Customer;
import com.Estore.Project.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CustomerController.URL)
public class CustomerController
{
    public static final String URL ="/e-store/v2/customers";
    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService)
    {
        this.customerService = customerService;
    }
    @GetMapping(value="/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String sayHello() {

        return "Hello there!";
    }
    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
     public ApiResponse registerCustomer(@RequestBody Customer customer)
     {
        return customerService.RegisterCustomer(customer);
     }
     @GetMapping("/login/{username}/{password}")
     public ApiResponse CustomerLogin (@PathVariable String username , @PathVariable String password)
     {
         return customerService.customerLogIn(username,password);
     }








}
