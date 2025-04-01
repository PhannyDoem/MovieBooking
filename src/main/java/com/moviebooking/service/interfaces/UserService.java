package com.moviebooking.service.interfaces;

import com.moviebooking.dto.post.PostUserDto;
import com.moviebooking.entity.User;

public interface UserService {
    User createUser(PostUserDto postUserDto);
}
