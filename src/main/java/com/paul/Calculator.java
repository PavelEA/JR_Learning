package com.paul;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger LOGGER = LogManager.getLogger(Calculator.class);

    public int plus(int a, int b) {
        return a + b;
    }

    public int reverseNumber(int a) {
        return -a;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        LOGGER.info("Info lvl");
        LOGGER.error("error lvl");
        LOGGER.fatal("fatal lvl");
        LOGGER.debug("debug lvl");
        LOGGER.trace("trace lvl");

        System.out.println(calculator.minus(2, 2));
        System.out.println(calculator.multiply(20, 100));
        System.out.println(calculator.reverseNumber(112));
        System.out.println(calculator.plus(10, 11));
    }
}
