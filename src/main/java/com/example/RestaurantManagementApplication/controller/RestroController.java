package com.example.RestaurantManagementApplication.controller;

import com.example.RestaurantManagementApplication.model.Restro;
import com.example.RestaurantManagementApplication.service.RestroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestroController {
    @Autowired
    RestroService restroService;

    //get list of restaurant
    @GetMapping("restaurants")
    public List<Restro> getAllRestro(){
        return restroService.getAllRestro();
    }
    @PostMapping("add/restros")
    public String addListOfRestro(@RequestBody List<Restro> restros){
        return restroService.addListOfRestro(restros);
    }
    @GetMapping("retro/{id}")
    public Restro getRestroById(@PathVariable Integer id){
        return restroService.getRestroById(id);
    }
    @PutMapping("update/speciality")
    public String updateSpeciality(@RequestParam Integer id,@RequestParam String sp){
        return restroService.updateSpeciality(id,sp);
    }
    @DeleteMapping("remove/restro/{id}")
    public String deleteRestro(@PathVariable Integer id){
        return restroService.deleteRestro(id);
    }

}
