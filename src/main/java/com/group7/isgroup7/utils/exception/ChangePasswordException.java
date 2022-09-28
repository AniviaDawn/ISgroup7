package com.group7.isgroup7.utils.exception;

public class ChangePasswordException extends ServiceException{
    public ChangePasswordException() {
        super();
    }

    public ChangePasswordException(String message) {
        super(message);
    }

    public ChangePasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChangePasswordException(Throwable cause) {
        super(cause);
    }

    protected ChangePasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
