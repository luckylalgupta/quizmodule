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

    @OneToMany
    private List<Option> options;

    @OneToMany
    private List<Option> answers;

    public Question() {
    }

    public Question(Integer id, String description, List<Option> options, List<Option> answers) {
        this.id = id;
        this.description = description;
        this.options = options;
        this.answers = answers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public List<Option> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Option> answers) {
        this.answers = answers;
    }
}
