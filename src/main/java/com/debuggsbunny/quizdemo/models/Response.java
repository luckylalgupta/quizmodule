package com.debuggsbunny.quizdemo.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Question question;

    @ManyToMany
    private List<Option> userAnswers;

    @ManyToOne
    private Game game;

    @Column
    private Boolean isCorrect;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Option> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<Option> userAnswers) {
        this.userAnswers = userAnswers;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }

    public Response() {
    }

    public Response(Integer id, Question question, List<Option> userAnswers, Game game, Boolean isCorrect) {
        this.id = id;
        this.question = question;
        this.userAnswers = userAnswers;
        this.game = game;
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", question=" + question +
                ", userAnswers=" + userAnswers +
                ", game=" + game +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
