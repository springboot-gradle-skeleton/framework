package com.skeleton.framework.exception.business;

import com.skeleton.framework.exception.BusinessException;
import com.skeleton.framework.exception.ExceptionCode;

public class UnauthenticatedException extends BusinessException {
    public UnauthenticatedException(String errorCode) {
        super(errorCode);
        this.setCode(ExceptionCode.UNAUTHENTICATED.getValue());
    }

    public UnauthenticatedException(String errorCode, String message) {
        super(errorCode, message);
        this.setCode(ExceptionCode.UNAUTHENTICATED.getValue());
    }

    public UnauthenticatedException(String errorCode, String message, String details) {
        super(errorCode, message, details);
        this.setCode(ExceptionCode.UNAUTHENTICATED.getValue());
    }
}
