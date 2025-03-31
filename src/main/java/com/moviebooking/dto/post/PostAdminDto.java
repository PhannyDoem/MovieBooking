package com.moviebooking.dto.post;

public record PostAdminDto(
         String firstName,
         String lastName,
         String email,
         String password,
         String gender,
         String phone,
         String address
) {
}
