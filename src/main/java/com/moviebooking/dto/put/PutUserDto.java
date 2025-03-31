package com.moviebooking.dto.put;

public record PutUserDto(
        String address,
        String email,
        String password,
        String phone,
        String gender,
        String firstName,
        String lastName
) {
}
