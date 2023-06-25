package com.example.RestaurantManagementApplication.service;

import com.example.RestaurantManagementApplication.model.Restro;
import com.example.RestaurantManagementApplication.repository.RestroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Service
public class RestroService {
    @Autowired
    RestroRepo restroRepo;

    public List<Restro> getAllRestro() {
        return restroRepo.getRestro();
    }

    public String addListOfRestro(List<Restro> restros) {
        List<Restro> originalList = getAllRestro();
        originalList.addAll(restros);
        return "new restaurants created !!!";
    }

    public Restro getRestroById(Integer id) {
        List<Restro> origionalList = getAllRestro();
        for(Restro r:origionalList){
            if(r.getRestroId().equals(id)){
                return r;
            }
        }
        throw new IllegalStateException("no id found");
    }

    public String updateSpeciality(Integer id, String sp) {
        List<Restro> originalList = getAllRestro();
        for(Restro r:originalList){
            if(r.getRestroId().equals(id)){
                r.setSpeciality(sp);
                return "Speciality updated !!!";
            }
        }
        return "id not found !!!";
    }

    public String deleteRestro(Integer id) {
        List<Restro> origionalList = getAllRestro();
        for(Restro r:origionalList){
            if(r.getRestroId().equals(id)){
                origionalList.remove(r);
                return "restro deleted";
            }
        }
        return "id not found to delete";
    }
}
