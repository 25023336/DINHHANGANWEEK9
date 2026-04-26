package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorService();

        logger.info("Application started");
        logger.info("2 + 3 = {}", calculator.add(2, 3));
        logger.info("10 - 4 = {}", calculator.subtract(10, 4));
        logger.info("6 * 7 = {}", calculator.multiply(6, 7));
        logger.info("20 / 5 = {}", calculator.divide(20, 5));
        logger.info("Application finished");
    }
}
