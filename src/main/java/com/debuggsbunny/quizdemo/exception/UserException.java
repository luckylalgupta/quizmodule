package com.debuggsbunny.quizdemo.exception;

public class UserException extends RuntimeException {
    static final long serialVersionUID = -7034897190745766878L;

    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public UserException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
    public UserException() {
        super();
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }
}
