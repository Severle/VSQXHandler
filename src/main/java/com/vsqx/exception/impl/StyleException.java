package com.vsqx.exception.impl;

import com.vsqx.exception.ParameterException;

public class StyleException extends ParameterException {
    public StyleException() {
        super();
    }

    public StyleException(String message) {
        super(message);
    }

    public StyleException(String message, Throwable cause) {
        super(message, cause);
    }

    public StyleException(Throwable cause) {
        super(cause);
    }

    protected StyleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
