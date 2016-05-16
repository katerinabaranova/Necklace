package com.baranova.necklace.exception;

public class NotValidStoneException extends Exception {

    public NotValidStoneException() {
    }

    public NotValidStoneException(String message) {
        super(message);
    }

    public NotValidStoneException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotValidStoneException(Throwable cause) {
        super(cause);
    }
}
