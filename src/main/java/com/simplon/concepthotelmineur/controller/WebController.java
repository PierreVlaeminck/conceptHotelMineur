package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.dto.UserForm;
import com.simplon.concepthotelmineur.entity.*;
import com.simplon.concepthotelmineur.repository.UserProfileRepository;
import com.simplon.concepthotelmineur.service.BookingService;
import com.simplon.concepthotelmineur.service.HostelService;
import com.simplon.concepthotelmineur.service.ReviewsService;
import com.simplon.concepthotelmineur.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
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

    private final ReviewsService reviewsService;

    /**
     * Constructs a new WebController with the given services.
     *
     * @param hostelService      the HostelService to be used
     * @param bookingService     the BookingService to be used
     * @param userProfileService the UserProfileService to be used
     */
    public WebController(HostelService hostelService, BookingService bookingService,
                         UserProfileService userProfileService, ReviewsService reviewsService) {
        this.hostelService = hostelService;
        this.bookingService = bookingService;
        this.userProfileService = userProfileService;
        this.reviewsService = reviewsService;
    }

    /**
     * Renders the home page.
     *
     * @param hostel the Hostel object
     * @param model  the model to be used for rendering the view
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
    public String register(UserForm createUser, Model model) {
        if (createUser == null || !model.containsAttribute("createUser")) {
            model.addAttribute("createUser", new UserForm());
        }
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
     * Retrieves the details of a hotel and prepares the data to be displayed on the hotel detail page.
     *
     * @param id    the ID of the hotel
     * @param model the model object to hold the data for the view
     * @return the name of the view template for the hotel detail page
     */
    @GetMapping("/hotel/{id}")
    public String hotel(@PathVariable Long id, Model model) {
        Hostel hostel = hostelService.findHostelByIdH(id);
        List<BenefitHostel> benefitHostels = hostel.getBenefitHostels();
        List<Room> rooms = hostel.getRooms();
        List<Reviews> reviews = reviewsService.findReviewsByHostelLimited(hostel, 3);
        model.addAttribute("reviews", reviews);
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
        List<Reviews> reviews = reviewsService.findReviewsByHostel(hostel);
        model.addAttribute("reviews", reviews);
        return "reviews";
    }


    /**
     * Renders the user profile page for the given user profile ID.
     *
     * @param model       the model to be used for rendering the view
     * @param userDetails the UserProfile object
     * @return the view name for the user profile page
     */

    @GetMapping("/profil")
    public String getProfile(Model model, @AuthenticationPrincipal UserDetails userDetails) {
        String username = userDetails.getUsername();
        UserProfile userProfile = userProfileService.findByUsername(username);
        model.addAttribute("userProfile", userProfile);
        return "userPage";
    }

    @GetMapping("/mot_de_passe")
    public String getPassword(){
        return "updatePassword";
    }
}