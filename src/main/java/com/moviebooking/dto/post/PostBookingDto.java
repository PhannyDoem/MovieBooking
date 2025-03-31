package com.moviebooking.dto.post;

import com.moviebooking.entity.Payment;
import com.moviebooking.entity.Showtime;
import com.moviebooking.entity.User;

public record PostBookingDto(
        Payment payment,
        Integer seats,
        Showtime showtimes,
        User user
) {
}
