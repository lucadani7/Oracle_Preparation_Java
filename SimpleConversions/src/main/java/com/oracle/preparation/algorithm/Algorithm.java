package com.oracle.preparation.algorithm;

public interface Algorithm {
    String convertFromDecimalToBaseX(int num, int newBase) throws IllegalArgumentException;
    int convertFromAnyBaseToDecimal(String num, int oldBase);
    int charToDecimal(char c);
    String convertNumberToNewBaseCustom(String num, int oldBase, int newBase);
    char convertRemainderToLiteral(int num);
}
