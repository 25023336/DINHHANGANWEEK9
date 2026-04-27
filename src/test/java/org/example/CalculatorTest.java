package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add_returnsCorrectSum() {
        assertEquals(7, calculator.add(3, 4));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    void subtract_returnsCorrectDifference() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-8, calculator.subtract(-5, 3));
    }

    @Test
    void divide_returnsCorrectQuotient() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void divide_throwsWhenDivisorIsZero() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
        assertEquals("Divisor must not be zero", ex.getMessage());
    }

    @Test
    void isEven_handlesEvenAndOdd() {
        assertTrue(calculator.isEven(8));
        assertFalse(calculator.isEven(7));
        assertTrue(calculator.isEven(0));
    }
}
