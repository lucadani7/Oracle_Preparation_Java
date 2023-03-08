package com.oracle.preparation;

import com.oracle.preparation.algorithm.Algorithm;
import com.oracle.preparation.algorithm.AlgorithmImplementation;

public class SimpleConversions {

    public static void main(String[] args) {
        Algorithm algorithm = new AlgorithmImplementation();
        System.out.println("Convert number 89 to base 5: " + algorithm.convertFromDecimalToBaseX(89, 5));
        System.out.println("Convert number 0B11 (base 12) to decimal: " + algorithm.convertFromAnyBaseToDecimal("0B11", 12));
        System.out.println("Convert number 017 (base 8) to base 2: " + algorithm.convertNumberToNewBaseCustom("017", 8, 2));
    }
}
