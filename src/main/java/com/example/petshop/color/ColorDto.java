package com.example.petshop.color;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Color} entity
 */
@Data
public class ColorDto implements Serializable {
    private Integer colorId;
    @Size(max = 50)
    @NotNull
    private String furColor;
}