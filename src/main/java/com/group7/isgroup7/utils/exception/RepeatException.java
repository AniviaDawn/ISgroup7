package com.group7.isgroup7.utils.exception;

public class RepeatException extends ServiceException{
    public RepeatException() {
        super();
    }

    public RepeatException(String message) {
        super(message);
    }

    public RepeatException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepeatException(Throwable cause) {
        super(cause);
    }

    protected RepeatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
