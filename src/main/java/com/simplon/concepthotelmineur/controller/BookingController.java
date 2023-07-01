package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.dto.BookingForm;
import com.simplon.concepthotelmineur.entity.Booking;
import com.simplon.concepthotelmineur.entity.Minor;
import com.simplon.concepthotelmineur.entity.UserProfile;
import com.simplon.concepthotelmineur.repository.BookingRepository;
import com.simplon.concepthotelmineur.repository.MinorRepository;
import com.simplon.concepthotelmineur.repository.UserProfileRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class BookingController {
    @Autowired
    private MinorRepository minorRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;

    @PostMapping("/paiement")
    public String payProcess(@ModelAttribute BookingForm bookingForm, HttpSession session, Principal principal) {

        // Créez des instances des entités Minor, Booking et UserProfile à partir des données du DTO
        Minor minor = new Minor();
        minor.setFirstName(bookingForm.getFirstName());
        minor.setLastName(bookingForm.getLastName());
        minor.setCellPhone(bookingForm.getCellphone());
        minor.setDateOfBirthM(bookingForm.getDateOfBirthM());
        minor.setFamilyRelationship(bookingForm.getFamilyRelationship());
        minor.setAdditionalInformation(bookingForm.getAdditionalInformation());

        Booking booking = new Booking();
        booking.setBookingCode(bookingForm.getBookingCode());
        booking.setDateArrived(bookingForm.getDateArrived());
        booking.setDepartureDate(bookingForm.getDepartureDate());
        booking.setTotalPrice(bookingForm.getTotalPrice());
        booking.setPending(bookingForm.getPending());
        // Set other properties for the Booking entity

        UserProfile userProfile = userProfileRepository.findByUsername(principal.getName());
        // Set properties for the UserProfile entity

        // Set associations between entities
        booking.setMinor(minor);
        booking.setUserProfile(userProfile);
        // Set other associations

        // Enregistrez les entités dans votre système de persistance (par exemple, une base de données)
        minorRepository.save(minor);
        bookingRepository.save(booking);

        return "redirect:/profil";
    }
}