package com.debuggsbunny.quizdemo.exception;

public class UserNotFoundException extends RuntimeException {
    static final long serialVersionUID = -7034897190745766878L;

    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public UserNotFoundException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
