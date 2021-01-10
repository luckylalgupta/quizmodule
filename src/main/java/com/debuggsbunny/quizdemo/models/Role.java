package com.debuggsbunny.quizdemo.models;

public enum Role {
    USER,ADMIN;
    public String getValue() {
        return this.name();
    }
}
