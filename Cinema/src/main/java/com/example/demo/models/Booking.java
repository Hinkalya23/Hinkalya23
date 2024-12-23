package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "booking")
public class Booking {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "number_booking")
    private int numberBooking;
    @Column(name = "time_creating")
    private String timeCreating;
    @Column(name = "row")
    private int row;
    @Column(name = "place")
    private int place;
    @Column(name = "total_price")
    private int totalPrice;

}
