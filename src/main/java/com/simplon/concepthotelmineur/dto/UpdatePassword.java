package com.simplon.concepthotelmineur.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatePassword {

    private String username;

    @NotBlank
    @Size(min = 1, max = 255)
    private String oldPassword;

    @NotBlank
    @Size(min = 1, max = 255)
    private String newPassword;

    @NotBlank
    @Size(min = 1, max = 255)
    private String confirmPassword;
}