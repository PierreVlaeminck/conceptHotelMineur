package com.simplon.concepthotelmineur.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class CreateUser {


    @Size(min=1, max=255)
    private String login;

    @Size(min=1, max=255)
    private String password;

    @Size(min=1, max=255)
    private String confirmPassword;

    @Size(min=1, max=255)
    private String lastName;

    @Size(min=1, max=255)
    private String firstName;

    private LocalDate dateOfBirthU;

    @Size(min=1, max=320)
    private String mailU;

    @Size(min=1, max=255)
    private String phone;

    @Size(min=1, max=255)
    private String cellPhoneU;
}
