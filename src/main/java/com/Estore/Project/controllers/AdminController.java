package com.Estore.Project.controllers;


import com.Estore.Project.ApiResponse;
import com.Estore.Project.models.Admin;
import com.Estore.Project.models.Customer;
import com.Estore.Project.models.StoreOwner;
import com.Estore.Project.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(AdminController.URL)
public class AdminController
{
   public static final String URL="/e-store/v2/admins";
    private  ArrayList<Admin> adminRequests = new ArrayList<>();

    @Autowired
    private final AdminService adminService;

    public AdminController(AdminService adminService)
    {
        this.adminService = adminService;
    }

    @GetMapping(value = "/customers")
    public List<Customer> getAllCustomer()
    {
        return adminService.getAllCustomer();
    }
    @GetMapping(value = "/store owners")
    public List<StoreOwner> getAllStoreOwners()
    {
        return adminService.getAllStoreOwners();
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
   public String registerAdmin(@RequestBody Admin admin)
   {
       adminRequests.add(admin);
       return "Status : Pending ";
   }




}
