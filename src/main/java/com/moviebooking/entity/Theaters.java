package com.moviebooking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "theaters")
public class Theaters {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "theater_id")
    private Long theaterId;
    @Column(name = "theater_name")
    private String theaterName;
    @Column(name = "location")
    private String location;
    public Theaters() {}

    public Theaters(String theaterName, String location) {
        this.theaterName = theaterName;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Long theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }
}
