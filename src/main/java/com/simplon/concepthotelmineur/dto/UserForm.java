package com.simplon.concepthotelmineur.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserForm {


    @Size(min = 1, max = 255)
    private String login;

    @Size(min = 1, max = 255)
    private String password;

    @Size(min = 1, max = 255)
    private String confirmPassword;

    @Size(min = 1, max = 255)
    private String lastNameU;

    @Size(min = 1, max = 255)
    private String firstNameU;

    private LocalDate dateOfBirthU;

    @Size(min = 1, max = 320)
    private String mailU;

    @Size(max = 255)
    private String phone;

    @Size(min = 1, max = 255)
    private String cellPhoneU;
}
