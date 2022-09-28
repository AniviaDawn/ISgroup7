package com.group7.isgroup7.utils.exception;

public class BatchException extends ServiceException{
    public BatchException() {
        super();
    }

    public BatchException(String message) {
        super(message);
    }

    public BatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public BatchException(Throwable cause) {
        super(cause);
    }

    protected BatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
