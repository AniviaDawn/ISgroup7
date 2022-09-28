package com.group7.isgroup7.utils.exception;

public class PoliticalReviewNotSatisfiedException extends ServiceException{
    public PoliticalReviewNotSatisfiedException() {
        super();
    }

    public PoliticalReviewNotSatisfiedException(String message) {
        super(message);
    }

    public PoliticalReviewNotSatisfiedException(String message, Throwable cause) {
        super(message, cause);
    }

    public PoliticalReviewNotSatisfiedException(Throwable cause) {
        super(cause);
    }

    protected PoliticalReviewNotSatisfiedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
