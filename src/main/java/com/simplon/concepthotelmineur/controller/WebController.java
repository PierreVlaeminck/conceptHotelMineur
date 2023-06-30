package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.entity.*;
import com.simplon.concepthotelmineur.service.BookingService;
import com.simplon.concepthotelmineur.service.HostelService;
import com.simplon.concepthotelmineur.service.UserProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Controller class for handling web requests and rendering views.
 */
@Controller
public class WebController {

    private final HostelService hostelService;
    private final BookingService bookingService;
    private final UserProfileService userProfileService;

    /**
     * Constructs a new WebController with the given services.
     *
     * @param hostelService       the HostelService to be used
     * @param bookingService      the BookingService to be used
     * @param userProfileService  the UserProfileService to be used
     */
    public WebController(HostelService hostelService, BookingService bookingService, UserProfileService userProfileService) {
        this.hostelService = hostelService;
        this.bookingService = bookingService;
        this.userProfileService = userProfileService;
    }

    /**
     * Renders the home page.
     *
     * @param hostel  the Hostel object
     * @param model   the model to be used for rendering the view
     * @return the view name for the home page
     */
    @GetMapping("/")
    public String home(Hostel hostel, Model model) {
        List<Hostel> hostelList = hostelService.findAllHostel();
        model.addAttribute("hostelList", hostelList);
        return "index";
    }

    /**
     * Renders the login page.
     *
     * @return the view name for the login page
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * Renders the registration page.
     *
     * @return the view name for the registration page
     */
    @GetMapping("/inscription")
    public String register() {
        return "userRegister";
    }

    /**
     * Renders the booking page.
     *
     * @return the view name for the booking page
     */
    @GetMapping("/reservation")
    public String booking() {
        return "booking";
    }

    /**
     * Renders the hostel page for the given hostel ID.
     *
     * @param id     the ID of the hostel
     * @param model  the model to be used for rendering the view
     * @return the view name for the hostel page
     */
    @GetMapping("/hotel/{id}")
    public String hotel(@PathVariable Long id, Model model) {
        Hostel hostel = hostelService.findHostelByIdH(id);
        List<BenefitHostel> benefitHostels = hostel.getBenefitHostels();
        List<Room> rooms = hostel.getRooms();
        model.addAttribute("hostel", hostel);
        model.addAttribute("benefitHostels", benefitHostels);
        model.addAttribute("rooms", rooms);
        return "hostel";
    }

    /**
     * Renders the reviews page.
     *
     * @return the view name for the reviews page
     */
    @GetMapping("/avis_clients/{id}")
    public String getReviewsByHotel(@PathVariable Long id, Model model) {
        Hostel hostel = hostelService.findHostelByIdH(id);
        model.addAttribute("hostel", hostel); // Ajoutez les avis au modèle
        return "reviews";
    }


    /**
     * Renders the user profile page for the given user profile ID.
     *
     * @param model          the model to be used for rendering the view
     * @param userProfile   the UserProfile object
     * @param id             the ID of the user profile
     * @return the view name for the user profile page
     */
    @GetMapping("/profil/{id}")
    public String profil(Model model, UserProfile userProfile, @PathVariable Long id) {
        List<Booking> bookingListByUserProfile = bookingService.findAllBookingByUserProfil(userProfile);
        model.addAttribute("bookingListByUserProfile", bookingListByUserProfile);
        UserProfile userProfileById = userProfileService.findUserProfileByIdUp(id);
        model.addAttribute("userProfileById", userProfileById);
        return "userPage";
    }
}