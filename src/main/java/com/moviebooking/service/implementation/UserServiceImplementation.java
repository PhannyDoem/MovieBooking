package com.moviebooking.service.implementation;

import com.moviebooking.dto.post.PostUserDto;
import com.moviebooking.entity.User;
import com.moviebooking.mapper.UserMapper;
import com.moviebooking.repository.UserRepository;
import com.moviebooking.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    @Override
    public User createUser(PostUserDto postUserDto) {
        User user = userMapper.postToUserDto(postUserDto);
        return userRepository.save(user);
    }
}
