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

    @OneToMany
    private List<Option> answers;

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

    public List<Option> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Option> answers) {
        this.answers = answers;
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

    public Response(Integer id, Question question, List<Option> answers, Game game, Boolean isCorrect) {
        this.id = id;
        this.question = question;
        this.answers = answers;
        this.game = game;
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", question=" + question +
                ", answers=" + answers +
                ", game=" + game +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
