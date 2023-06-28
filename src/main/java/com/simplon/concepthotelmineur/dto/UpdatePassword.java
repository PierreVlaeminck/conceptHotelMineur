package com.simplon.concepthotelmineur.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

public class UpdatePassword {

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    @NotBlank
    @Size(min = 1, max = 255)
    private String oldPassword;

    @Getter
    @Setter
    @NotBlank
    @Size(min = 1, max = 255)
    private String newPassword;

    @Getter
    @Setter
    @NotBlank
    @Size(min = 1, max = 255)
    private String confirmPassword;
}