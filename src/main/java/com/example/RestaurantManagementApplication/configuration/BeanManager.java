package com.example.RestaurantManagementApplication.configuration;

import com.example.RestaurantManagementApplication.model.Restro;
import com.example.RestaurantManagementApplication.model.Type;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
    @Bean
    public List<Restro> getinitializedList(){
        Restro initRestro = new Restro(0,"Barcedo","Katua pura west","9898765678","italian",50, Type.BISTRO);
        List<Restro> initList = new ArrayList<>();
        initList.add(initRestro);
        return initList;
    }
}
