package com.group7.isgroup7.utils.exception;

public class ReportException extends ServiceException{
    public ReportException() {
        super();
    }

    public ReportException(String message) {
        super(message);
    }

    public ReportException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReportException(Throwable cause) {
        super(cause);
    }

    protected ReportException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
