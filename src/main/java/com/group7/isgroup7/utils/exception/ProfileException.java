package com.group7.isgroup7.utils.exception;

public class ProfileException extends ServiceException{
    public ProfileException() {
        super();
    }

    public ProfileException(String message) {
        super(message);
    }

    public ProfileException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProfileException(Throwable cause) {
        super(cause);
    }

    protected ProfileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
