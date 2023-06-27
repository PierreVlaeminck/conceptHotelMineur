package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Booking;
import com.simplon.concepthotelmineur.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;

    public void createBooking (Booking booking){
        bookingRepository.save(booking);
    }

    public void deleteBooking (Long idB){
        bookingRepository.deleteByIdB(idB);
    }

}
