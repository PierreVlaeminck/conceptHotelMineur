package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.dto.UpdatePassword;
import com.simplon.concepthotelmineur.service.UserProfileService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

/**
 * Controller class for managing user accounts and password changes.
 */
@Controller
public class UsersController {

    private final PasswordEncoder passwordEncoder;
    private final UserDetailsManager userDetailsManager;
    private static final String UPDATE_PASSWORD = "updatePassword";

    @Autowired
    private UserProfileService userProfileService;

    /**
     * Constructs a new UsersController with the given PasswordEncoder and UserDetailsManager.
     *
     * @param passwordEncoder    the PasswordEncoder to be used
     * @param userDetailsManager the UserDetailsManager to be used
     */
    public UsersController(PasswordEncoder passwordEncoder, UserDetailsManager userDetailsManager) {
        this.passwordEncoder = passwordEncoder;
        this.userDetailsManager = userDetailsManager;
    }

    /**
     * Changes the user's password.
     *
     * @param updatePassword     the password form object containing password data
     * @param bindingResult      the binding result for form validation
     * @param principal          the principal object representing the current user
     * @param redirectAttributes the redirect attributes
     * @return a redirect to the home page or the change password form in case of validation errors
     */
    @PostMapping("/mot_de_passe")
    public String changePassword(@Valid @ModelAttribute("passwordForm") UpdatePassword updatePassword,
                                 BindingResult bindingResult,
                                 Principal principal,
                                 RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return UPDATE_PASSWORD;
        }

        String username = principal.getName();

        if (!passwordEncoder.matches(updatePassword.getOldPassword(),
                userDetailsManager.loadUserByUsername(username).getPassword())) {
            bindingResult.rejectValue("oldPassword", "passwordChange.invalidOldPassword");
            return UPDATE_PASSWORD;
        }

        if (!updatePassword.getNewPassword().equals(updatePassword.getConfirmPassword())) {
            bindingResult.rejectValue("newPassword", "passwordChange.passwordsDoNotMatch");
            return UPDATE_PASSWORD;
        }

        String encodedPassword = passwordEncoder.encode(updatePassword.getNewPassword());
        userDetailsManager.changePassword(
                String.valueOf(userDetailsManager.loadUserByUsername(username).getPassword()),
                encodedPassword);

        redirectAttributes.addFlashAttribute("successMessage", "Your password has been successfully changed.");
        return "redirect:/";
    }

}