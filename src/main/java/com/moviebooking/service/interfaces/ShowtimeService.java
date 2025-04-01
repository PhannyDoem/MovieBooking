package com.moviebooking.service.interfaces;

import com.moviebooking.dto.post.PostShowTimeDto;
import com.moviebooking.entity.Showtime;

public interface ShowtimeService {
    Showtime postShowtime(PostShowTimeDto postShowTimeDto);
}
