package com.Estore.Project.repositories;

import com.Estore.Project.models.StoreOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreOwnerRepository extends JpaRepository<StoreOwner,Integer>
{

}
