package com.example.petshop.pet;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class PetRequest {
    private Integer petId;
    @Size(max = 50)
    @NotNull
    private String petName;
    @Size(max = 50)
    @NotNull
    private String petCode;
    private Integer colorId;
    @Size(max = 50)
    @NotNull
    private String colorColor;
    private Integer countryId;
    @Size(max = 50)
    @NotNull
    private String countryName;
    private Integer typeId;
    @Size(max = 50)
    @NotNull
    private String typeName;
    private Integer userId;


}
