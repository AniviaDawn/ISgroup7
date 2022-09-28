package com.group7.isgroup7.utils.exception;

public class PasswordNotSame extends ServiceException{
    public PasswordNotSame() {
        super();
    }

    public PasswordNotSame(String message) {
        super(message);
    }

    public PasswordNotSame(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordNotSame(Throwable cause) {
        super(cause);
    }

    protected PasswordNotSame(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
