package com.example.petshop.country;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Country} entity
 */
@Data
public class CountryDto implements Serializable {
    private Integer countryId;
    @Size(max = 50)
    @NotNull
    private  String countryName;
}