package com.moviebooking.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "showtimes")
public class Showtime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "showtime_id")
    private Long showtimeId;
    @Column(name = "start_time")
    private LocalDate startTime;
    @Column(name = "end_time")
    private LocalDate endTime;
    @Column(name = "seats")
    private BigDecimal seats;
    @Column(name = "theater")
    private String theater;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id") // Corrected column name
    private Movie movie;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "theater_id")
    private Theaters theaters;

    public Showtime(){}

    public Showtime(LocalDate endTime, Movie movie, BigDecimal seats, LocalDate startTime, String theater, Theaters theaters) {
        this.endTime = endTime;
        this.movie = movie;
        this.seats = seats;
        this.startTime = startTime;
        this.theater = theater;
        this.theaters = theaters;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public BigDecimal getSeats() {
        return seats;
    }

    public void setSeats(BigDecimal seats) {
        this.seats = seats;
    }

    public Long getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(Long showtimeId) {
        this.showtimeId = showtimeId;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public String getTheater() {
        return theater;
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    public Theaters getTheaters() {
        return theaters;
    }

    public void setTheaters(Theaters theaters) {
        this.theaters = theaters;
    }
}
