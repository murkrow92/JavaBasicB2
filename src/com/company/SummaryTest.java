package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummaryTest {
    @Test
    public void testLower() {
        boolean result = Summary.checkCondition(14);
        assertFalse(result);
    }

    @Test
    public void testHigher() {
        boolean result = Summary.checkCondition(36);
        assertFalse(result);
    }

    @Test
    public void testLowerExact() {
        boolean result = Summary.checkCondition(15);
        assertFalse(result);
    }

    @Test
    public void testHigherExact() {
        boolean result = Summary.checkCondition(35);
        assertFalse(result);
    }

    @Test
    public void testRightValue() {
        boolean result = Summary.checkCondition(20);
        assertTrue(result);

        result = Summary.checkCondition(34);
        assertTrue(result);
    }
}