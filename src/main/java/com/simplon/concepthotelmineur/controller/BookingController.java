package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.service.*;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    private final BookingService bookingService;
    private final RoomService roomService;
    private final MinorService minorService;
    private final UserProfileService userProfileService;

    public BookingController(BookingService bookingService,
                             RoomService roomService, MinorService minorService,
                             UserProfileService userProfileService) {
        this.bookingService = bookingService;
        this.roomService = roomService;
        this.minorService = minorService;
        this.userProfileService = userProfileService;
    }
}