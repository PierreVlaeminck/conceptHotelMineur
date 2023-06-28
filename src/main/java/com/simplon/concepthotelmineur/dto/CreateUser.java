package com.simplon.concepthotelmineur.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class CreateUser {

    @Getter
    @Setter
    @NotBlank
    @Size(min=1, max=255)
    private String login;

    @Getter
    @Setter
    @NotBlank
    @Size(min=1, max=255)
    private String password;

    @Getter
    @Setter
    @NotBlank
    @Size(min=1, max=255)
    private String confirmPassword;

    @Getter
    @Setter
    @NotBlank
    @Size(min=1, max=255)
    private String lastName;

    @Getter
    @Setter
    @NotBlank
    @Size(min=1, max=255)
    private String firstName;

    @Getter
    @Setter
    @NotNull
    private LocalDate dateOfBirthU;

    @Getter
    @Setter
    @NotBlank
    @Size(min=1, max=320)
    private String mailU;

    @Getter
    @Setter
    @NotBlank
    @Size(min=1, max=255)
    private String phone;

    @Getter
    @Setter
    @Size(min=1, max=255)
    private String cellPhoneU;
}
