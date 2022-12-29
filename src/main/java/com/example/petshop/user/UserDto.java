package com.example.petshop.user;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link User} entity
 */
@Data
public class UserDto implements Serializable {
    private Integer userId;
    @Size(max = 50)
    @NotNull
    private String userName;
    @Size(max = 50)
    @NotNull
    private String userPassword;
}