package com.debuggsbunny.quizdemo.models;

import com.sun.javafx.geom.transform.Identity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Game {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Quiz quiz;

    @Column
    private LocalDateTime startedAt;

    @Column
    private LocalDateTime endedAt;

    @Column
    @ManyToMany
    private User player;


    @OneToOne
    private Result result;

    @OneToMany
    private List<Response> responses;

}
