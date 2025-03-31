package com.moviebooking.dto.post;

public record PostUserDto(
        String address,
        String email,
        String password,
        String phone,
        String gender,
        String firstName,
        String lastName
) {
}
