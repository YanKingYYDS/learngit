package com.neu.exception;

public class ParamException extends RuntimeException {

    public ParamException() {
        super();
    }

    public ParamException(String message) {
        super(message);
    }

    public ParamException(String message, Throwable cause) {
        super(message, cause);
    }
    public ParamException(Throwable cause) {
        super(cause);
    }
}
