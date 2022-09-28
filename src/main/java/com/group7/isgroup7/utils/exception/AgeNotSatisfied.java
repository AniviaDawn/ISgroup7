package com.group7.isgroup7.utils.exception;

public class AgeNotSatisfied extends ServiceException{
    public AgeNotSatisfied() {
        super();
    }

    public AgeNotSatisfied(String message) {
        super(message);
    }

    public AgeNotSatisfied(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeNotSatisfied(Throwable cause) {
        super(cause);
    }

    protected AgeNotSatisfied(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
