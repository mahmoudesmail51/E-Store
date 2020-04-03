package com.Estore.Project.services;

import com.Estore.Project.models.Admin;
import com.Estore.Project.models.Customer;
import com.Estore.Project.models.StoreOwner;
import com.Estore.Project.repositories.AdminRepository;
import com.Estore.Project.repositories.CustomerRepository;
import com.Estore.Project.repositories.StoreOwnerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;
    private final CustomerRepository customerRepository;
    private final StoreOwnerRepository storeOwnerRepository;
    private ArrayList<Admin> adminRequests = new ArrayList<>();
    public AdminServiceImpl(AdminRepository adminRepository, CustomerRepository customerRepository, StoreOwnerRepository storeOwnerRepository) {
        this.adminRepository = adminRepository;
        this.customerRepository = customerRepository;
        this.storeOwnerRepository = storeOwnerRepository;
    }

    @Override
    public void RegisterAdmin(Admin admin)
    {
        adminRequests.add(admin);
    }

    @Override
    public void manageAdminsRequest(ArrayList<Admin> list)
    {

    }

    @Override
    public List<Customer> getAllCustomer()
    {
               return customerRepository.findAll();

    }

    @Override
    public List<StoreOwner> getAllStoreOwners()
    {
        return storeOwnerRepository.findAll();
    }
}
