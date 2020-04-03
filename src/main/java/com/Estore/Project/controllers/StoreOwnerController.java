package com.Estore.Project.controllers;

import com.Estore.Project.ApiResponse;
import com.Estore.Project.models.Customer;
import com.Estore.Project.models.StoreOwner;
import com.Estore.Project.services.StoreOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(StoreOwnerController.URL)
public class StoreOwnerController
{
    public static final String URL ="/e-store/v2/store owners";
    @Autowired
    private final StoreOwnerService storeOwnerService;

    public StoreOwnerController(StoreOwnerService storeOwnerService)
    {
        this.storeOwnerService = storeOwnerService;
    }

    @GetMapping(value="/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String sayHello() {

        return "Hello there!";
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse registerStoreOwner(@RequestBody StoreOwner storeOwner)
    {
        return storeOwnerService.RegisterStoreOwner(storeOwner);
    }
}
