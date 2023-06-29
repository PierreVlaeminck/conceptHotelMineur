package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.service.BookingService;
import com.simplon.concepthotelmineur.service.MinorService;
import com.simplon.concepthotelmineur.service.RoomService;
import com.simplon.concepthotelmineur.service.UserProfileService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    private final BookingService bookingService;
    private final RoomService roomService;
    private final UserProfileService userProfileService;
    private final MinorService minorService;

    public BookingController(BookingService bookingService,
                             RoomService roomService,
                             UserProfileService userProfileService,
                             MinorService minorService) {
        this.bookingService = bookingService;
        this.roomService = roomService;
        this.userProfileService = userProfileService;
        this.minorService = minorService;
    }
}