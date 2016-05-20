package com.baranova.necklace.exception;

public class WrongIntervalException extends Exception {

    public WrongIntervalException() {
    }

    public WrongIntervalException(String message) {
        super(message);
    }

    public WrongIntervalException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongIntervalException(Throwable cause) {
        super(cause);
    }
}
