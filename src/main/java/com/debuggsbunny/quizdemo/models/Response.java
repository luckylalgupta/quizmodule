package com.debuggsbunny.quizdemo.models;

import jdk.nashorn.internal.codegen.OptimisticTypesPersistence;

import javax.persistence.*;

@Entity
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Result result;

    @ManyToOne
    private Question question;

    @ManyToOne
    private Option userAnswer;
}
