package com.skeleton.framework.exception.business;

import com.skeleton.framework.exception.BusinessException;
import com.skeleton.framework.exception.ExceptionCode;

public class OutOfRangeException extends BusinessException {
    public OutOfRangeException(String errorCode) {
        super(errorCode);
        this.setCode(ExceptionCode.OUT_OF_RANGE.getValue());
    }

    public OutOfRangeException(String errorCode, String message) {
        super(errorCode, message);
        this.setCode(ExceptionCode.OUT_OF_RANGE.getValue());
    }

    public OutOfRangeException(String errorCode, String message, String details) {
        super(errorCode, message, details);
        this.setCode(ExceptionCode.OUT_OF_RANGE.getValue());
    }
}
