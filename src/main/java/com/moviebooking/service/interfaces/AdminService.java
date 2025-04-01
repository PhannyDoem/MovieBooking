package com.moviebooking.service.interfaces;

import com.moviebooking.dto.post.PostAdminDto;
import com.moviebooking.entity.Admin;

public interface AdminService {
    Admin createAdmin(PostAdminDto postAdminDto);
}
