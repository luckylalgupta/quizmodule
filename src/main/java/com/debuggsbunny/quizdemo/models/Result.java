package com.debuggsbunny.quizdemo.models;

import javax.persistence.*;
@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Game game;

    @Column
    private Integer score;
}
