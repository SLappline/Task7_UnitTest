package Tests;

import org.example.Calculator.Calculate;
import org.example.Calculator.Numbers;
import org.example.Calculator.Operations;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void additionCheck(){
        Object actual = Calculate.calc(8.0, 2.0, '+');
        double expected = 10;
        double result_actual = Calculate.value;
        assertEquals(expected, result_actual);
    }

    @Test
    public void subtractionCheck() {
        Object actual = Calculate.calc(6.0, 2.2, '-');
        double expected = 3.8;
        double result_actual = Calculate.value;
        assertEquals(expected, result_actual);
    }

    @Test
    public void multiplicationCheck() {
        Object actual = Calculate.calc(8.1, 2.2, '*');
        double expected = 17.82;
        double result_actual = Calculate.value;
        assertEquals(expected, result_actual);
    }

    @Test
    public void divisionCheck() {
        Object actual = Calculate.calc(4.3, 5.5, '/');
        double expected = 0.7818181818181817;
        double result_actual = Calculate.value;
        assertEquals(expected, result_actual);
    }

    @Test
    public void divisionZero() {
        Assertions.assertTrue(Calculate.calc(2, 0, '/') instanceof ArithmeticException);
    }

    @Test
    public void wrongNumber() {
        Assertions.assertTrue(Numbers.numbers("2,1") instanceof NumberFormatException);
    }

    @Test
    public void wrongOperation() {
        Assertions.assertTrue(Operations.operation("|") instanceof InputMismatchException);
    }
}

//expected = ArithmeticException.class