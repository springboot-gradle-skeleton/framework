package com.skeleton.framework.exception.system;

import com.skeleton.framework.exception.BusinessException;
import com.skeleton.framework.exception.ExceptionCode;

public class UnknownException extends BusinessException {
    public UnknownException(String errorCode) {
        super(errorCode);
        this.setCode(ExceptionCode.UNKNOWN.getValue());
    }

    public UnknownException(String errorCode, String message) {
        super(errorCode, message);
        this.setCode(ExceptionCode.UNKNOWN.getValue());
    }

    public UnknownException(String errorCode, String message, String details) {
        super(errorCode, message, details);
        this.setCode(ExceptionCode.UNKNOWN.getValue());
    }
}
