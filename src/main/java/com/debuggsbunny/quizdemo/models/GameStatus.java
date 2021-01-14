package com.debuggsbunny.quizdemo.models;

public enum GameStatus {
    INSTANTIATED,
    PLAYING,
    ENDED,
    PAUSED,
    ABANDONED,
    TERMINATED,
    EXPIRED;

    public String getValue() {
        return this.name();
    }

}
