package com.Estore.Project.services;

import com.Estore.Project.models.Admin;
import com.Estore.Project.models.Customer;
import com.Estore.Project.models.StoreOwner;

import java.util.ArrayList;
import java.util.List;

public interface AdminService
{

    void RegisterAdmin(Admin admin);

    void manageAdminsRequest(ArrayList<Admin> list);

    List<Customer> getAllCustomer();

    List<StoreOwner> getAllStoreOwners();



}
