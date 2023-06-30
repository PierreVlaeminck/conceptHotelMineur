package com.simplon.concepthotelmineur.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatePassword {

    private String username;

    @Size(min = 1, max = 255)
    private String oldPassword;

    @Size(min = 1, max = 255)
    private String newPassword;

    @Size(min = 1, max = 255)
    private String confirmPassword;
}