package com.Estore.Project.repositories;

import com.Estore.Project.models.StoreOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreOwnerRepository extends JpaRepository<StoreOwner,Integer>
{
    List<StoreOwner> findByuserName(String username);
}
