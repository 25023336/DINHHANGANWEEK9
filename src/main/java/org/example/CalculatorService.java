package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorService {
    private static final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    public int add(int a, int b) {
        int result = a + b;
        logger.info("add({}, {}) = {}", a, b, result);
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        logger.info("subtract({}, {}) = {}", a, b, result);
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        logger.info("multiply({}, {}) = {}", a, b, result);
        return result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            logger.error("divide({}, {}) failed: division by zero", a, b);
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int result = a / b;
        logger.info("divide({}, {}) = {}", a, b, result);
        return result;
    }
}

