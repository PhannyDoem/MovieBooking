package com.moviebooking.service.implementation;

import com.moviebooking.dto.post.PostAdminDto;
import com.moviebooking.entity.Admin;
import com.moviebooking.mapper.AdminMapper;
import com.moviebooking.repository.AdminRepository;
import com.moviebooking.service.interfaces.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImplementation implements AdminService {
    private final AdminRepository adminRepository;
    private final AdminMapper adminMapper;

    @Autowired
    public AdminServiceImplementation(AdminRepository adminRepository, AdminMapper adminMapper) {
        this.adminRepository = adminRepository;
        this.adminMapper = adminMapper;
    }

    @Override
    public Admin createAdmin(PostAdminDto postAdminDto) {
        Admin admin = adminMapper.postToAdminDto(postAdminDto);
        return adminRepository.save(admin);
    }
}
