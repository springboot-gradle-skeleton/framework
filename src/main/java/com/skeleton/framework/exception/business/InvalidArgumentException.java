package com.skeleton.framework.exception.business;

import com.skeleton.framework.exception.BusinessException;
import com.skeleton.framework.exception.ExceptionCode;

public class InvalidArgumentException extends BusinessException {
    public InvalidArgumentException(String errorCode) {
        super(errorCode);
        this.setCode(ExceptionCode.INVALID_ARGUMENT.getValue());
    }

    public InvalidArgumentException(String errorCode, String message) {
        super(errorCode, message);
        this.setCode(ExceptionCode.INVALID_ARGUMENT.getValue());
    }

    public InvalidArgumentException(String errorCode, String message, String details) {
        super(errorCode, message, details);
        this.setCode(ExceptionCode.INVALID_ARGUMENT.getValue());
    }
}
