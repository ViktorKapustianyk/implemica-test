package org.viktor_kapustianyk;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialDigitSumTest {
    FactorialDigitSum factorialDigitSum = new FactorialDigitSum();

    @Test
    void testCalculateFactorial() {
        BigInteger expected = new BigInteger("3628800"); // 10!
        assertEquals(expected, factorialDigitSum.calculateFactorial(10));
    }

    @Test
    void testSumOfDigits() {
        BigInteger factorialOf10 = new BigInteger("3628800");
        assertEquals(27, factorialDigitSum.sumOfDigits(factorialOf10)); // Sum of digits of 3628800
    }

    @Test
    void testFactorialDigitSumFor100() {
        BigInteger factorial = factorialDigitSum.calculateFactorial(100);
        int digitSum = factorialDigitSum.sumOfDigits(factorial);
        assertEquals(648, digitSum, "The sum of the digits in 100! should be 648");
    }
}