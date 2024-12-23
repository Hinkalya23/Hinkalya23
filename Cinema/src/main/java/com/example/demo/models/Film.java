package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "film")
public class Film {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "film_id")
    private int filmId;
    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;
    @Column(name = "description")
    private String description;
    @Column(name = "director")
    private String director;
    @Column(name = "compositor")
    private String compositor;
    @Column(name = "ages_rating")
    private int agesRating;
    @Column(name = "realease")
    private String realease;
    @Column(name = "date_start")
    private String dateStart;
}
