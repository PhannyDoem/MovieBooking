package com.moviebooking.mapper;

import com.moviebooking.dto.post.PostBookingDto;
import com.moviebooking.dto.put.PutBookingDto;
import com.moviebooking.entity.Booking;
import org.springframework.stereotype.Service;

@Service
public class BookingMapper {
    public Booking postToBookingDto(PostBookingDto postBookingDto){
        Booking booking = new Booking(
                postBookingDto.payment(),
                postBookingDto.seats(),
                postBookingDto.showtimes(),
                postBookingDto.user()
        );
        booking.setBookingId(0L);
        return booking;
    }

    public Booking updateBookingDto(PutBookingDto putBookingDto){
        Booking booking = new Booking(
                putBookingDto.payment(),
                putBookingDto.seats(),
                putBookingDto.showtimes(),
                putBookingDto.user()
        );
        booking.setBookingId(0L);
        return booking;
    }
}
