package com.debuggsbunny.quizdemo.models;

import com.sun.javafx.geom.transform.Identity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Quiz quiz;

    @Column
    private LocalDateTime startedAt;

    @Column
    private LocalDateTime endedAt;

    @ManyToOne
    private User player;

    @OneToMany
    private List<Response> responses;

    public Game() {
    }
}
