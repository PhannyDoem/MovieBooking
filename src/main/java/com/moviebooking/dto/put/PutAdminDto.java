package com.moviebooking.dto.put;

public record PutAdminDto(
        String firstName,
        String lastName,
        String email,
        String password

) {
}
