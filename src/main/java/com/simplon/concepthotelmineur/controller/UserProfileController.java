package com.simplon.concepthotelmineur.controller;

import ch.qos.logback.core.model.Model;
import com.simplon.concepthotelmineur.dto.CreateUser;
import com.simplon.concepthotelmineur.entity.UserProfile;
import com.simplon.concepthotelmineur.service.UserProfileService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;

/**
 * Controller class for managing user profiles.
 */
@Controller
public class UserProfileController {

    private final UserProfileService userProfileService;
    private final PasswordEncoder passwordEncoder;
    private final UserDetailsManager userDetailsManager;

    /**
     * Constructs a new UserProfileController with the given UserProfileService, PasswordEncoder, and UserDetailsManager.
     *
     * @param userProfileService  the UserProfileService to be used
     * @param passwordEncoder     the PasswordEncoder to be used
     * @param userDetailsManager the UserDetailsManager to be used
     */
    public UserProfileController(UserProfileService userProfileService, PasswordEncoder passwordEncoder, UserDetailsManager userDetailsManager) {
        this.userProfileService = userProfileService;
        this.passwordEncoder = passwordEncoder;
        this.userDetailsManager = userDetailsManager;
    }

    /**
     * Creates a new user profile and user account.
     *
     * @param createUser  the CreateUser object containing the user details
     * @param validation  the BindingResult object for validating the user input
     * @param model       the Model object for handling the view
     * @return a redirect to the home page
     */
    @PostMapping("/Inscription")
    @Transactional
    public String createUser(@Valid @ModelAttribute("CreateUser") CreateUser createUser, BindingResult validation, Model model) {
        if (!createUser.getPassword().equals(createUser.getConfirmPassword())) {
            createUser.setConfirmPassword("");
            validation.addError(new FieldError("CreateUser", "confirmPassword", "Passwords do not match."));
        }
        if (validation.hasErrors()) {
            return "userRegister";
        }

        String encodedPassword = passwordEncoder.encode(createUser.getPassword());
        Collection<? extends GrantedAuthority> roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));

        User user = new User(createUser.getLogin(), encodedPassword, roles);
        userDetailsManager.createUser(user);

        UserProfile userProfile = new UserProfile();
        userProfile.setUsername(createUser.getLogin());
        userProfile.setFirstNameU(createUser.getFirstName());
        userProfile.setLastNameU(createUser.getLastName());
        userProfile.setMailU(createUser.getMailU());
        userProfile.setPhone(createUser.getPhone());
        userProfile.setCellPhoneU(createUser.getCellPhoneU());
        userProfile.setDateOfBirthU(createUser.getDateOfBirthU());

        userProfileService.addUserProfile(userProfile);

        return "redirect:/";
    }

    /**
     * Deletes a user profile.
     *
     * @param id the ID of the user profile to be deleted
     */
    @DeleteMapping("/users/{id}")
    public void deleteUserProfile(@PathVariable Long id) {
        userProfileService.deleteUserProfile(id);
    }

    /**
     * Updates a user profile.
     *
     * @param id        the ID of the user profile to be updated
     * @param newProfile the updated UserProfile object
     * @return the updated UserProfile
     */
    @PutMapping("/users/{id}")
    public UserProfile updateUserProfile(@PathVariable Long id, @RequestBody UserProfile newProfile) {
        UserProfile userProfile = userProfileService.findUserProfileByIdUp(id);

        userProfile.setFirstNameU(newProfile.getFirstNameU());
        userProfile.setLastNameU(newProfile.getLastNameU());
        userProfile.setMailU(newProfile.getMailU());
        userProfile.setPhone(newProfile.getPhone());
        userProfile.setCellPhoneU(newProfile.getCellPhoneU());
        userProfile.setDateOfBirthU(newProfile.getDateOfBirthU());

        return userProfileService.updateUserProfile(userProfile);
    }
}