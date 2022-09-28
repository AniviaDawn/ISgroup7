package com.group7.isgroup7.utils.exception;

public class TimeException extends ServiceException{
    public TimeException() {
        super();
    }

    public TimeException(String message) {
        super(message);
    }

    public TimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimeException(Throwable cause) {
        super(cause);
    }

    protected TimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
