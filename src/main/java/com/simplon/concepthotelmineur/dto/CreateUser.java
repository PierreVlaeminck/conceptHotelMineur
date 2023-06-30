package com.simplon.concepthotelmineur.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class CreateUser {


    @NotBlank
    @Size(min=1, max=255)
    private String login;

    @NotBlank
    @Size(min=1, max=255)
    private String password;

    @NotBlank
    @Size(min=1, max=255)
    private String confirmPassword;

    @NotBlank
    @Size(min=1, max=255)
    private String lastName;

    @NotBlank
    @Size(min=1, max=255)
    private String firstName;

    @NotNull
    private LocalDate dateOfBirthU;

    @NotBlank
    @Size(min=1, max=320)
    private String mailU;

    @NotBlank
    @Size(min=1, max=255)
    private String phone;

    @Size(min=1, max=255)
    private String cellPhoneU;
}
