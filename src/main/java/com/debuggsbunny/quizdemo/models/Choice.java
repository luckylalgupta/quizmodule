package com.debuggsbunny.quizdemo.models;

public enum Choice {
    A,B,C,D,E;
    public String getValue(){
        return this.name();
    }
}
