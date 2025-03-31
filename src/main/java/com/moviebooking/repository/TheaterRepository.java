package com.moviebooking.repository;

import com.moviebooking.entity.Theaters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theaters, Long> {
}
