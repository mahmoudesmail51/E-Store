package com.Estore.Project.services;

import com.Estore.Project.ApiResponse;
import com.Estore.Project.models.StoreOwner;
import com.Estore.Project.repositories.StoreOwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class StoreOwnerServiceImpl implements StoreOwnerService {

    private final StoreOwnerRepository storeOwnerRepository;

    public StoreOwnerServiceImpl(StoreOwnerRepository storeOwnerRepository) {
        this.storeOwnerRepository = storeOwnerRepository;
    }

    @Override
    public ApiResponse RegisterStoreOwner(StoreOwner storeOwner) {
        storeOwnerRepository.save(storeOwner);
        return new ApiResponse(200,"success",storeOwner);
    }
}
