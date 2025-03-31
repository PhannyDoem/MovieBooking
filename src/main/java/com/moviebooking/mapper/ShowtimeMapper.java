package com.moviebooking.mapper;

import com.moviebooking.dto.post.PostShowTimeDto;
import com.moviebooking.dto.put.PutShowtimeDto;
import com.moviebooking.entity.Showtime;
import org.springframework.stereotype.Service;

@Service
public class ShowtimeMapper {
    public Showtime postToShowtime(PostShowTimeDto postShowTimeDto){
        Showtime showtime = new Showtime(
                postShowTimeDto.endTime(),
                postShowTimeDto.movie(),
                postShowTimeDto.seats(),
                postShowTimeDto.startTime(),
                postShowTimeDto.theater(),
                postShowTimeDto.theaters()
        );
        showtime.setShowtimeId(0L);
        return showtime;
    }

    public Showtime updateShowtimeDto(PutShowtimeDto putShowtimeDto){
        Showtime showtime = new Showtime(
                putShowtimeDto.endTime(),
                putShowtimeDto.movie(),
                putShowtimeDto.seats(),
                putShowtimeDto.startTime(),
                putShowtimeDto.theater(),
                putShowtimeDto.theaters()
        );
        showtime.setShowtimeId(0L);
        return showtime;
    }
}
