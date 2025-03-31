package com.moviebooking.dto.put;

import java.time.LocalDate;

public record PutMovieDto(
        String title,
        String genre,
        String director,
        LocalDate duration,
        String image,
        String cast,
        String synopsis
) {
}
