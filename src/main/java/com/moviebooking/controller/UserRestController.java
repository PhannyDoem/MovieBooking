package com.moviebooking.controller;

import com.moviebooking.dto.post.PostUserDto;
import com.moviebooking.entity.User;
import com.moviebooking.service.implementation.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/values/v1")
public class UserRestController {
    private final UserServiceImplementation userServiceImplementation;
    @Autowired
    public UserRestController(UserServiceImplementation userServiceImplementation) {
        this.userServiceImplementation = userServiceImplementation;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody PostUserDto postUserDto) {
        User user = userServiceImplementation.createUser(postUserDto);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
