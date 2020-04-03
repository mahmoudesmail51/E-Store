package com.Estore.Project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "storeowner")

public class StoreOwner
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer storeOwnerId;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "userName")
    private String userName;
    @Column(name = "Password")
    private String password;




}
