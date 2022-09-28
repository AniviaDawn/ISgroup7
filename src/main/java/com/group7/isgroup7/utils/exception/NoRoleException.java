package com.group7.isgroup7.utils.exception;

public class NoRoleException extends ServiceException{
    public NoRoleException() {
        super();
    }

    public NoRoleException(String message) {
        super(message);
    }

    public NoRoleException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoRoleException(Throwable cause) {
        super(cause);
    }

    protected NoRoleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
