package com.example.RestaurantManagementApplication.repository;

import com.example.RestaurantManagementApplication.model.Restro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RestroRepo {
    @Autowired
    private List<Restro> restroList;
    public List<Restro> getRestro(){
        return restroList;
    }

}
