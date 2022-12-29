package com.example.petshop.pet;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Pet} entity
 */
@Data
public class PetUpdate implements Serializable {

    @Size(max = 50)
    @NotNull
    private String name;
    @Size(max = 50)
    @NotNull
    private String code;
    private  Integer colorId;
//    @Size(max = 50)
//    @NotNull
//    private String colorColor;
    private Integer countryId;
//    @Size(max = 50)
//    @NotNull
//    private String countryName;
    private Integer typeId;
//    @Size(max = 50)
//    @NotNull
//    private String typeName;



}