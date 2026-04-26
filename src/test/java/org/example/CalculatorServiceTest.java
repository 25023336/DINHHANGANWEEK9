package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceTest {

    private final CalculatorService calculator = new CalculatorService();

    @Test
    void add_shouldReturnSum() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtract_shouldReturnDifference() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void multiply_shouldReturnProduct() {
        assertEquals(42, calculator.multiply(6, 7));
    }

    @Test
    void divide_shouldReturnQuotient() {
        assertEquals(4, calculator.divide(20, 5));
    }

    @Test
    void divide_byZero_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}