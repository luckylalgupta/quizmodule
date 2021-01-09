package com.debuggsbunny.quizdemo.models;

import javax.persistence.*;

public class Result {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @Column
    private Game game;

    @Column
    private Integer score;
}
