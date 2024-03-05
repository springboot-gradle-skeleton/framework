package com.skeleton.framework.exception.system;

import com.skeleton.framework.exception.BusinessException;
import com.skeleton.framework.exception.ExceptionCode;

public class InternalException extends BusinessException {
    public InternalException(String errorCode) {
        super(errorCode);
        this.setCode(ExceptionCode.INTERNAL.getValue());
    }

    public InternalException(String errorCode, String message) {
        super(errorCode, message);
        this.setCode(ExceptionCode.INTERNAL.getValue());
    }

    public InternalException(String errorCode, String message, String details) {
        super(errorCode, message, details);
        this.setCode(ExceptionCode.INTERNAL.getValue());
    }
}
