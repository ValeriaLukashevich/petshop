package com.example.petshop.type;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Type} entity
 */
@Data
public class TypeDto implements Serializable {
    private Integer typeId;
    @Size(max = 50)
    @NotNull
    private String typeName;
}