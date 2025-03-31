package com.moviebooking.mapper;

import com.moviebooking.dto.post.PostMovieDto;
import com.moviebooking.dto.put.PutMovieDto;
import com.moviebooking.entity.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieMapper {
    public Movie postToMovie(PostMovieDto postMovieDto) {
        Movie movie = new Movie(
                postMovieDto.title(),
                postMovieDto.genre(),
                postMovieDto.director(),
                postMovieDto.duration(),
                postMovieDto.image(),
                postMovieDto.cast(),
                postMovieDto.synopsis()
        );
        movie.setMovieId(0L);
        return movie;
    }

    public Movie updateMovieDto(PutMovieDto putMovieDto) {
        Movie movie = new Movie(
                putMovieDto.title(),
                putMovieDto.genre(),
                putMovieDto.director(),
                putMovieDto.duration(),
                putMovieDto.image(),
                putMovieDto.cast(),
                putMovieDto.synopsis()
        );
        movie.setMovieId(0L);
        return movie;
    }
}
