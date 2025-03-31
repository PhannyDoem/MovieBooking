package com.moviebooking.mapper;

import com.moviebooking.dto.post.PostAdminDto;
import com.moviebooking.dto.put.PutAdminDto;
import com.moviebooking.entity.Admin;
import org.springframework.stereotype.Service;

@Service
public class AdminMapper {
    public Admin postToAdminDto(PostAdminDto postAdminDto) {
        Admin admin = new Admin(
                postAdminDto.firstName(),
                postAdminDto.lastName(),
                postAdminDto.email(),
                postAdminDto.password(),
                postAdminDto.gender(),
                postAdminDto.phone(),
                postAdminDto.address()
        );
        admin.setAdminId(0L);
        return admin;
    }

    public Admin updateAdminDto(PutAdminDto putAdminDto) {
        Admin admin = new Admin(
                putAdminDto.firstName(),
                putAdminDto.lastName(),
                putAdminDto.email(),
                putAdminDto.password(),
                putAdminDto.gender(),
                putAdminDto.phone(),
                putAdminDto.address()
        );
        admin.setAdminId(0L);
        return admin;
    }
}
