package com.vsqx.exception.impl;

import com.vsqx.exception.ParameterException;

public class CCException extends ParameterException{
    public CCException() {
        super();
    }

    public CCException(String message) {
        super(message);
    }

    public CCException(String message, Throwable cause) {
        super(message, cause);
    }

    public CCException(Throwable cause) {
        super(cause);
    }

    protected CCException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
