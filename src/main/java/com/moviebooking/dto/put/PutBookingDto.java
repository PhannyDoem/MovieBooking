package com.moviebooking.dto.put;

import com.moviebooking.entity.Payment;
import com.moviebooking.entity.Showtime;
import com.moviebooking.entity.User;

public record PutBookingDto(
        Payment payment,
        Integer seats,
        Showtime showtimes,
        User user
) {
}
