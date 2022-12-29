package com.example.petshop.pet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Pet} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetRequestDto implements Serializable {
    private Integer userId;

    private String name;
    @Size(max = 50)
    @NotNull
    private String code;
    @NotNull
    private Integer colorId;
    @NotNull
    private Integer countryId;
    @NotNull
    private Integer typeId;


}
