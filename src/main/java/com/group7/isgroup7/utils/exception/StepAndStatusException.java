package com.group7.isgroup7.utils.exception;

public class StepAndStatusException extends ServiceException{
    public StepAndStatusException() {
        super();
    }

    public StepAndStatusException(String message) {
        super(message);
    }

    public StepAndStatusException(String message, Throwable cause) {
        super(message, cause);
    }

    public StepAndStatusException(Throwable cause) {
        super(cause);
    }

    protected StepAndStatusException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
