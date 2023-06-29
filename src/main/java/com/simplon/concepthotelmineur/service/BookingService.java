package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Booking;
import com.simplon.concepthotelmineur.entity.UserProfile;
import com.simplon.concepthotelmineur.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;

    public Booking findBookingById(Long id){
       return bookingRepository.findById(id).orElseThrow(
               ()-> new RuntimeException("Aucune reservation trouvé avec cet id : " + id));
    }

    public Booking createBooking (Booking booking){
        return bookingRepository.save(booking);
    }

    public List<Booking> findAllBookingByUserProfil(UserProfile userProfile){
        return bookingRepository.getBookingByUserProfile(userProfile);
    }

    public void deleteBooking (Long id){
        bookingRepository.deleteById(id);
    }
}
