package com.baranova.necklace.exception;

public class WrongNecklaceException extends Exception {

    public WrongNecklaceException() {
    }

    public WrongNecklaceException(String message) {
        super(message);
    }

    public WrongNecklaceException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongNecklaceException(Throwable cause) {
        super(cause);
    }
}
