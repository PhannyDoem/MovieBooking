package com.moviebooking.mapper;

import com.moviebooking.dto.post.PostTheaterDto;
import com.moviebooking.dto.put.PutTheaterDto;
import com.moviebooking.entity.Theaters;
import org.springframework.stereotype.Service;

@Service
public class TheatersMapper {
    public Theaters postToTheaters(PostTheaterDto postTheaterDto) {
        Theaters theaters = new Theaters(
                postTheaterDto.theaterName(),
                postTheaterDto.location()
        );
        theaters.setTheaterId(0L);
        return theaters;
    }
    public Theaters updateTheatersDto(PutTheaterDto putTheaterDto) {
        Theaters theaters = new Theaters(
                putTheaterDto.theaterName(),
                putTheaterDto.location()
        );
        theaters.setTheaterId(0L);
        return theaters;
    }

}
