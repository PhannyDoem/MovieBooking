package com.moviebooking.controller;

import com.moviebooking.dto.post.PostBookingDto;
import com.moviebooking.entity.Booking;
import com.moviebooking.service.implementation.BookingServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/values/v1/")
public class BookingRestController {

    private final BookingServiceImplementation bookingServiceImplementation;
    @Autowired
    public BookingRestController(BookingServiceImplementation bookingServiceImplementation) {
        this.bookingServiceImplementation = bookingServiceImplementation;
    }

    @PostMapping("/bookings")
    public ResponseEntity<Booking> bookingPost(@RequestBody PostBookingDto postBookingDto) {
        Booking booking = bookingServiceImplementation.createBooking(postBookingDto);
        return new ResponseEntity<>(booking, HttpStatus.CREATED);
    }

    @GetMapping("/bookings")
    public ResponseEntity<List<Booking>> getAllBookings() {
        return new ResponseEntity<>(bookingServiceImplementation.getAllBookings(), HttpStatus.OK);
    }
}
