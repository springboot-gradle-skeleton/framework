package com.skeleton.framework.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BusinessExceptionTest {
    @Test
    void test() {
        BusinessException be = new BusinessException("34");
        assertEquals(be.getCode(), 400);
    }
}