package com.example.RestaurantManagementApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restro {
    private Integer restroId;
    private String restroName;
    private String restroAddress;
    private String restroNumber;
    private String speciality;
    private Integer totalStaff;
    private Type restroType;
}
