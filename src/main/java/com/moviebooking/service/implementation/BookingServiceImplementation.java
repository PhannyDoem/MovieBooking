package com.moviebooking.service.implementation;

import com.moviebooking.dto.post.PostBookingDto;
import com.moviebooking.entity.Booking;
import com.moviebooking.mapper.BookingMapper;
import com.moviebooking.repository.BookingRepository;
import com.moviebooking.service.interfaces.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImplementation implements BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    @Autowired
    public BookingServiceImplementation(BookingRepository bookingRepository, BookingMapper bookingMapper) {
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
    }

    @Override
    public Booking createBooking(PostBookingDto postBookingDto) {
        Booking booking = bookingMapper.postToBookingDto(postBookingDto);
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}
