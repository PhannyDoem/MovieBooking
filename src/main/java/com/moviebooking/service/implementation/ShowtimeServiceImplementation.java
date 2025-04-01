package com.moviebooking.service.implementation;

import com.moviebooking.dto.post.PostShowTimeDto;
import com.moviebooking.entity.Showtime;
import com.moviebooking.mapper.ShowtimeMapper;
import com.moviebooking.repository.ShowtimeRepository;
import com.moviebooking.service.interfaces.ShowtimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowtimeServiceImplementation implements ShowtimeService {
    private final ShowtimeMapper showtimeMapper;
    private final ShowtimeRepository showtimeRepository;


    @Autowired
    public ShowtimeServiceImplementation(ShowtimeMapper showtimeMapper, ShowtimeRepository showtimeRepository) {
        this.showtimeMapper = showtimeMapper;
        this.showtimeRepository = showtimeRepository;
    }

    @Override
    public Showtime postShowtime(PostShowTimeDto postShowTimeDto) {
        Showtime showtime = showtimeMapper.postToShowtime(postShowTimeDto);
        return showtimeRepository.save(showtime);
    }
}
