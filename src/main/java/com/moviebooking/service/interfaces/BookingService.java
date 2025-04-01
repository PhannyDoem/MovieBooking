package com.moviebooking.service.interfaces;

import com.moviebooking.dto.post.PostBookingDto;
import com.moviebooking.entity.Booking;

import java.util.List;

public interface BookingService {
    Booking createBooking(PostBookingDto postBookingDto);
    List<Booking> getAllBookings();
}
