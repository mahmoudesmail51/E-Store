package com.Estore.Project.services;

import com.Estore.Project.ApiResponse;
import com.Estore.Project.models.StoreOwner;

public interface StoreOwnerService
{
    ApiResponse RegisterStoreOwner(StoreOwner storeOwner);
}
