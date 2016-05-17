package com.baranova.necklace.exception;

public class IntervalException extends Exception {

    public IntervalException() {
    }

    public IntervalException(String message) {
        super(message);
    }

    public IntervalException(String message, Throwable cause) {
        super(message, cause);
    }

    public IntervalException(Throwable cause) {
        super(cause);
    }
}
