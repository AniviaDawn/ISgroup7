package com.group7.isgroup7.utils.exception;

public class FileUpLoadFailException extends ServiceException{
    public FileUpLoadFailException() {
        super();
    }

    public FileUpLoadFailException(String message) {
        super(message);
    }

    public FileUpLoadFailException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileUpLoadFailException(Throwable cause) {
        super(cause);
    }

    protected FileUpLoadFailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
