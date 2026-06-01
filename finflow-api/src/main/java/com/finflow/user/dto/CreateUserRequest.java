package com.finflow.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateUserRequest(

        @NotBlank
        String name,

        @Email
        String email,

        @NotBlank
        String password

) {}
