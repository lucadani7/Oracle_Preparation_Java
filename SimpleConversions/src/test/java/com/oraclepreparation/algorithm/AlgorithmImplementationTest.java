package com.oraclepreparation.algorithm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmImplementationTest {
    Algorithm algorithm = new AlgorithmImplementation();

    @Test
    public void testWhenConvertingBase10ToBase16() {
        String expected = "C54";
        String actual = algorithm.convertFromDecimalToBaseX(3156, 16);
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenConvertingBase16ToDecimal() {
        int expected = 4096;
        int actual = algorithm.convertFromAnyBaseToDecimal("1000", 16);
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenConvertingBase12ToBase7() {
        String expected = "4441";
        String actual = algorithm.convertNumberToNewBaseCustom("0B11", 12, 7);
        assertEquals(expected, actual);
    }
}