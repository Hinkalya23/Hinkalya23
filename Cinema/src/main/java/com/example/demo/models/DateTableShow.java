package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "date_table_show")
public class DateTableShow {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "session")
    private int session;
    @Column(name = "number_hall")
    private int numberHall;
    @Column(name = "view_film")
    private String viewFilm;
    @Column(name = "time_session")
    private String timeSession;
}
