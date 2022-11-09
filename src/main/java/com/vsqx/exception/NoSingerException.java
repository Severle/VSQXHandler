package com.vsqx.exception;

public class NoSingerException extends Exception{
    public NoSingerException() {
        super();
    }

    public NoSingerException(String message) {
        super(message);
    }

    public NoSingerException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSingerException(Throwable cause) {
        super(cause);
    }

    protected NoSingerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
