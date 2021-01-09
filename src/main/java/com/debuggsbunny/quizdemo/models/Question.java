package com.debuggsbunny.quizdemo.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String description;

    @OneToMany(mappedBy = "question")
    private List<Option> options;

    @OneToMany(mappedBy = "question")
    private List<Option> answers;

}
