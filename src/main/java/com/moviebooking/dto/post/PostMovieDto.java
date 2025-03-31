package com.moviebooking.dto.post;

import java.time.LocalDate;

public record PostMovieDto(
        String title,
        String genre,
        String director,
        LocalDate duration,
        String image,
        String cast,
        String synopsis
) {
}
