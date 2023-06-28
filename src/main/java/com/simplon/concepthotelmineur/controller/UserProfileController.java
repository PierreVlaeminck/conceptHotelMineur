package com.simplon.concepthotelmineur.controller;

import ch.qos.logback.core.model.Model;
import com.simplon.concepthotelmineur.dto.CreateUser;
import com.simplon.concepthotelmineur.entity.UserProfile;
import com.simplon.concepthotelmineur.service.UserProfileService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Arrays;
import java.util.Collection;

@Controller
public class UserProfileController {

    private final UserProfileService userProfileService;

    private final PasswordEncoder passwordEncoder;

    private final UserDetailsManager userDetailsManager;

    public UserProfileController(UserProfileService userProfileService, PasswordEncoder passwordEncoder, UserDetailsManager userDetailsManager) {
        this.userProfileService = userProfileService;
        this.passwordEncoder = passwordEncoder;
        this.userDetailsManager = userDetailsManager;
    }

    @PostMapping("/Inscription")
    @Transactional
    public String createUser(@Valid @ModelAttribute("CreateUser") CreateUser createUser, BindingResult validation, Model model) {
        if (!createUser.getPassword().equals(createUser.getConfirmPassword())) {
            createUser.setConfirmPassword("");
            validation.addError(new FieldError("CreateUser", "confirmPassword", "Les mots de passe ne correspondent pas."));
        }
        if (validation.hasErrors()) {
            return "Inscription";
        }

        String encodedPassword = passwordEncoder.encode(createUser.getPassword());
        Collection<? extends GrantedAuthority> roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));

        User user = new User(createUser.getLogin(), encodedPassword, roles);
        userDetailsManager.createUser(user);

        UserProfile userProfile = new UserProfile();
        userProfile.setUsername(createUser.getLogin());
        userProfile.setFirstName(createUser.getFirstName());
        userProfile.setLastName(createUser.getLastName());
        userProfile.setMailU(createUser.getMailU());
        userProfile.setPhone(createUser.getPhone());
        userProfile.setCellPhoneU(createUser.getCellPhoneU());
        userProfile.setDateOfBirthU(createUser.getDateOfBirthU());

        userProfileService.addUserProfile(userProfile);

        return "redirect:/";
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserProfile(@PathVariable Long id) {
        userProfileService.deleteUserProfile(id);
    }
}
