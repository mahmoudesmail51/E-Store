package com.Estore.Project.services;

import com.Estore.Project.ApiResponse;
import com.Estore.Project.models.StoreOwner;
import com.Estore.Project.repositories.StoreOwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreOwnerServiceImpl implements StoreOwnerService {

    private final StoreOwnerRepository storeOwnerRepository;

    public StoreOwnerServiceImpl(StoreOwnerRepository storeOwnerRepository) {
        this.storeOwnerRepository = storeOwnerRepository;
    }

    @Override
    public ApiResponse RegisterStoreOwner(StoreOwner storeOwner) {
        storeOwnerRepository.save(storeOwner);
        return new ApiResponse(200,"Registered Successfully",storeOwner);
    }

    public ApiResponse customerLogIn(String username, String password) {
        List<StoreOwner> storeOwners = storeOwnerRepository.findByUsername(username);
        if (storeOwners.size()==1)
        {
            if (storeOwners.get(0).getPassword().equals(password))
            {
                storeOwners.get(0).setLoggedIn(true);
                return new ApiResponse(200,"Logged in Successfully",storeOwners.get(0));
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
