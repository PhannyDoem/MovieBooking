package com.moviebooking.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingId;
    @Column(name = "seats")
    private Integer seats;

    @ManyToOne
    @JoinColumn(name = "showtime_id") // Ensure this matches the database column name
    private Showtime showtimes;

    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL, optional = true)
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Booking() {}

    public Booking(Payment payment, Integer seats, Showtime showtimes, User user) {
        this.payment = payment;
        this.seats = seats;
        this.showtimes = showtimes;
        this.user = user;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }


    public Showtime getShowtimes() {
        return showtimes;
    }

    public void setShowtimes(Showtime showtimes) {
        this.showtimes = showtimes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
