package com.skeleton.framework.exception.business;

import com.skeleton.framework.exception.BusinessException;
import com.skeleton.framework.exception.ExceptionCode;

public class PermissionDeniedException extends BusinessException {
    public PermissionDeniedException(String errorCode) {
        super(errorCode);
        this.setCode(ExceptionCode.PERMISSION_DENIED.getValue());
    }

    public PermissionDeniedException(String errorCode, String message) {
        super(errorCode, message);
        this.setCode(ExceptionCode.PERMISSION_DENIED.getValue());
    }

    public PermissionDeniedException(String errorCode, String message, String details) {
        super(errorCode, message, details);
        this.setCode(ExceptionCode.PERMISSION_DENIED.getValue());
    }
}
