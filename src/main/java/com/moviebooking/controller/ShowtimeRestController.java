package com.moviebooking.controller;

import com.moviebooking.dto.post.PostShowTimeDto;
import com.moviebooking.entity.Showtime;
import com.moviebooking.service.implementation.ShowtimeServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/values/v1")
public class ShowtimeRestController {
    private final ShowtimeServiceImplementation showtimeServiceImplementation;

    public ShowtimeRestController(ShowtimeServiceImplementation showtimeServiceImplementation) {
        this.showtimeServiceImplementation = showtimeServiceImplementation;
    }

    @PostMapping("/showtimes")
    public ResponseEntity<Showtime> postShowtime(@RequestBody PostShowTimeDto postShowTimeDto){
        Showtime showtime = showtimeServiceImplementation.postShowtime(postShowTimeDto);
        return new ResponseEntity<>(showtime, HttpStatus.CREATED);
    }
}
