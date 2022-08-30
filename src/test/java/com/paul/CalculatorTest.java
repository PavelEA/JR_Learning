package com.paul;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class CalculatorTest {
    Calculator calculator = new Calculator();

    @Nested
    class Plus {
        @Test
        void WhenArgsIsPositive() {
            int expect = 2 + 3;
            int actual = calculator.plus(2, 3);
            assertEquals(expect, actual);
        }

        @Test
        void WhenArgsIsNegative() {
            int expect = (-2) + (-3);
            int actual = calculator.plus(-2, -3);
            assertEquals(expect, actual);
        }

        @Test
        void WhenArgsIsNull() {
            int expect = 0;
            int actual = calculator.plus(0, 0);
            assertEquals(expect, actual);
        }

        @Test
        void WhenFirstArgsIsPositive_AndSecondIsNegative() {
            int expect = 2 + (-3);
            int actual = calculator.plus(2, -3);
            assertEquals(expect, actual);
        }

        @Test
        void WhenFirstArgsIsNegative_AndSecondIsPositive() {
            int expect = (-2) + 3;
            int actual = calculator.plus(-2, 3);
            assertEquals(expect, actual);
        }

    }

    @Nested
    class ReverseNumber {
        @Test
        void WhenNumberIsPositive() {
            int expect = -100;
            int result = calculator.reverseNumber(100);
            assertEquals(expect, result);
        }

        @Test
        void WhenNumberIsNegative() {
            int expect = 100;
            int result = calculator.reverseNumber(-100);
            assertEquals(expect, result);
        }

        @Test
        void WhenNumberIsNull() {
            int expect = 0;
            int result = calculator.reverseNumber(0);
            assertEquals(expect, result);
        }
    }

    @Nested
    class Minus {
        @Test
        void WhenArgsIsPositive() {
            int expect = 2 - 3;
            int actual = calculator.minus(2, 3);
            assertEquals(expect, actual);
        }

        @Test
        void WhenArgsIsNegative() {
            int expect = (-2) - (-3);
            int actual = calculator.minus(-2, -3);
            assertEquals(expect, actual);
        }

        @Test
        void WhenArgsIsNull() {
            int expect = 0;
            int actual = calculator.minus(0, 0);
            assertEquals(expect, actual);
        }

        @Test
        void WhenFirstArgsIsPositive_AndSecondIsNegative() {
            int expect = 2 - (-3);
            int actual = calculator.minus(2, -3);
            assertEquals(expect, actual);
        }

        @Test
        void WhenFirstArgsIsNegative_AndSecondIsPositive() {
            int expect = (-2) - 3;
            int actual = calculator.minus(-2, 3);
            assertEquals(expect, actual);
        }
    }

    @Nested
    class Multiply {
        @Test
        void WhenArgsIsPositive() {
            int expect = 2 * 3;
            int actual = calculator.multiply(2, 3);
            assertEquals(expect, actual);
        }

        @Test
        void WhenArgsIsNegative() {
            int expect = (-2) * (-3);
            int actual = calculator.multiply(-2, -3);
            assertEquals(expect, actual);
        }

        @Test
        void WhenArgsIsNull() {
            int expect = 0;
            int actual = calculator.multiply(0, 0);
            assertEquals(expect, actual);
        }

        @Test
        void WhenFirstArgsIsPositive_AndSecondIsNegative() {
            int expect = 2 * (-3);
            int actual = calculator.multiply(2, -3);
            assertEquals(expect, actual);
        }

        @Test
        void WhenFirstArgsIsNegative_AndSecondIsPositive() {
            int expect = (-2) * 3;
            int actual = calculator.multiply(-2, 3);
            assertEquals(expect, actual);
        }
    }
}