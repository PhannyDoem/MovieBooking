package com.moviebooking.mapper;

import com.moviebooking.dto.post.PostUserDto;
import com.moviebooking.dto.put.PutUserDto;
import com.moviebooking.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    public User postToUserDto(PostUserDto postUserDto) {
        User user = new User(
                postUserDto.address(),
                postUserDto.email(),
                postUserDto.password(),
                postUserDto.phone(),
                postUserDto.gender(),
                postUserDto.firstName(),
                postUserDto.lastName()
        );
        user.setUserId(0L);
        return user;
    }

    public User updateUserDto(PutUserDto putUserDto) {
        User user = new User(
                putUserDto.address(),
                putUserDto.email(),
                putUserDto.password(),
                putUserDto.phone(),
                putUserDto.gender(),
                putUserDto.firstName(),
                putUserDto.lastName()
        );
        user.setUserId(0L);
        return user;
    }
}
