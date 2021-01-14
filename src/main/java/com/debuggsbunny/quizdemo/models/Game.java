package com.debuggsbunny.quizdemo.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Quiz quiz;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column
    private Date startedAt;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column
    private Date endedAt;

    @ManyToOne
    private User player;

    @OneToMany
    private List<Response> responses;

    @Column
    private String status;

    public Game() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
    }

    public User getPlayer() {
        return player;
    }

    public void setPlayer(User player) {
        this.player = player;
    }

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Game(Integer id, Quiz quiz, Date startedAt, Date endedAt, User player, List<Response> responses, String status) {
        this.id = id;
        this.quiz = quiz;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
        this.player = player;
        this.responses = responses;
        this.status = status;
    }
}
