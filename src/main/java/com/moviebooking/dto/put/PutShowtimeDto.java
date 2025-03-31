package com.moviebooking.dto.put;

import com.moviebooking.entity.Movie;
import com.moviebooking.entity.Theaters;

import java.math.BigDecimal;
import java.time.LocalDate;

public record PutShowtimeDto(
        LocalDate endTime,
        Movie movie,
        BigDecimal seats,
        LocalDate startTime,
        String theater,
        Theaters theaters
) {
}
