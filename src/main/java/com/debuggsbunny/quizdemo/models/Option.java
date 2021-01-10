package com.debuggsbunny.quizdemo.models;



import javax.persistence.*;

@Entity
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String value;

    @Column
    private Choice choice;

    public Option() {
    }

    public Option(Integer id, String value, Choice choice) {
        this.id = id;
        this.value = value;
        this.choice = choice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }
}
