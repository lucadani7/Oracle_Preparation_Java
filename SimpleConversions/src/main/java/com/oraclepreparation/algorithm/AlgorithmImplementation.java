package com.oraclepreparation.algorithm;

public class AlgorithmImplementation implements Algorithm {
    @Override
    public String convertFromDecimalToBaseX(int num, int newBase) throws IllegalArgumentException {
        if (newBase < 2 || newBase > 16) {
            throw new IllegalArgumentException("The new base must be from 2 - 16.");
        }
        StringBuilder result = new StringBuilder();
        for (; num > 0; num /= newBase) {
            int remainder = num % newBase;
            result.append(convertRemainderToLiteral(remainder));
        }
        return result.reverse().toString();
    }

    @Override
    public int convertFromAnyBaseToDecimal(String num, int oldBase) {
        if (oldBase < 2 || oldBase > 16) {
            return -1;
        }
        num = new StringBuilder(num).reverse().toString();
        int value = 0;
        int power = 1;
        for (char elem : num.toCharArray()) {
            int digit = charToDecimal(elem);
            if (digit < 0 || digit >= oldBase) {
                return -1;
            }
            value += digit * power;
            power *= oldBase;
        }
        return value;
    }

    @Override
    public int charToDecimal(char c) {
        return Character.isDigit(c) ? ((int) c - '0') : ((int) c - 'A' + 10);
    }

    @Override
    public String convertNumberToNewBaseCustom(String num, int oldBase, int newBase) {
        int decimalNumber = convertFromAnyBaseToDecimal(num, oldBase);
        var targetBase = "";
        try {
            targetBase = convertFromDecimalToBaseX(decimalNumber, newBase);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        return targetBase;
    }

    @Override
    public char convertRemainderToLiteral(int num) {
        return switch (num) {
            case 10 -> 'A';
            case 11 -> 'B';
            case 12 -> 'C';
            case 13 -> 'D';
            case 14 -> 'E';
            case 15 -> 'F';
            default -> String.valueOf(num).charAt(0);
        };
    }
}
