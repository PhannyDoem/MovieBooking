package com.moviebooking.controller;

import com.moviebooking.dto.post.PostAdminDto;
import com.moviebooking.entity.Admin;
import com.moviebooking.service.implementation.AdminServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
public class AdminRestController {
    private final AdminServiceImplementation adminServiceImplementation;
    @Autowired
    public AdminRestController(AdminServiceImplementation adminServiceImplementation) {
        this.adminServiceImplementation = adminServiceImplementation;
    }

    @PostMapping("/admins")
    public ResponseEntity<Admin> createAdmin(@RequestBody PostAdminDto postAdminDto) {
        return new ResponseEntity<>(adminServiceImplementation.createAdmin(postAdminDto), HttpStatus.CREATED);
    }
}
