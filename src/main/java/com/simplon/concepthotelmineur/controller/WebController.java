package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.entity.Booking;
import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.entity.UserProfile;
import com.simplon.concepthotelmineur.service.BookingService;
import com.simplon.concepthotelmineur.service.HostelService;
import com.simplon.concepthotelmineur.service.UserProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class WebController {

    private final HostelService hostelService;

    private final BookingService bookingService;

    private final UserProfileService userProfileService;

    public WebController(HostelService hostelService, BookingService bookingService, UserProfileService userProfileService) {
        this.hostelService = hostelService;
        this.bookingService = bookingService;
        this.userProfileService = userProfileService;
    }

    @GetMapping("/")
    public String home(Hostel hostel, Model model) {
        List<Hostel> hostelList = hostelService.findAllHostel();
        model.addAttribute("hostelList", hostelList);
        return ("index");
    }

    @GetMapping("/login")
    public String login(){
        return ("login");
    }

    @GetMapping("/inscription")
    public String register(){
        return ("userRegister");
    }

    @GetMapping("/reservation")
    public String booking(){
        return ("booking");
    }

    @GetMapping("/hotel/{id}")
    public String hotel(@PathVariable Long id, Model model){
        Hostel hostel = hostelService.findHostelByIdH(id);
        model.addAttribute("hostel", hostel);
        return ("hostel");
    }

    @GetMapping("/avis_clients")
    public String reviews(){
        return ("reviews");
    }

    @GetMapping("/profil/{id}")
    public String profil(Model model, UserProfile userProfile,@PathVariable Long id){
        List<Booking> bookingListByUserProfile = bookingService.findAllBookingByUserProfil(userProfile);
        model.addAttribute("bookingListByUserProfile", bookingListByUserProfile);
        UserProfile userProfileById = userProfileService.findUserProfileByIdUp(id);
        model.addAttribute("userProfileById", userProfileById);
        return ("userPage");
    }
}
