package org.viktor_kapustianyk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CatalanCalculatorTest {

    CatalanCalculator catalanCalculator = new CatalanCalculator();
    @Test
    void calculateCatalan_ZeroPairs_ReturnsOne() {
        assertEquals(1, catalanCalculator.calculatorCatalan(0));
    }

    @Test
    void calculateCatalan_OnePair_ReturnsOne() {
        assertEquals(1, catalanCalculator.calculatorCatalan(1));
    }

    @Test
    void calculateCatalan_TwoPairs_ReturnsTwo() {
        assertEquals(2, catalanCalculator.calculatorCatalan(2));
    }

    @Test
    void calculateCatalan_ThreePairs_ReturnsFive() {
        assertEquals(5, catalanCalculator.calculatorCatalan(3));
    }

    @Test
    void calculateCatalan_NegativeInput_ThrowsException(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> catalanCalculator.calculatorCatalan(-1));
        assertEquals("N must be a non-negative integer.", exception.getMessage());
    }
}