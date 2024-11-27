package org.viktor_kapustianyk;

import java.math.BigInteger;

public class FactorialDigitSum {
    /**
     * Calculates the factorial of a given number.
     * @param n the number for which factorial is calculated
     * @return the factorial as a BigInteger
     */
    public BigInteger calculateFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    /**
     * Calculates the sum of the digits in a given number.
     * @param number the number whose digits are summed
     * @return the sum of the digits
     */
    public int sumOfDigits(BigInteger number) {
        String numberAsString = number.toString();
        int sum = 0;
        for (char digit : numberAsString.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }
}
