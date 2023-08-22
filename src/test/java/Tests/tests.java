package Tests;

import org.example.Calculator.Calculate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    public void additionCheck(){
        assertEquals(8.0, 2.0, '+');
        System.out.println(10);
    }

    @Test
    void subtractionCheck() {
        assertEquals(6.0, 2.0, '-');
        System.out.println(8);
    }

    @Test
    void multiplicationCheck() {
        assertEquals(12.0, 2.0, '*');
        System.out.println(14);
    }

    @Test
    void divisionCheck() {
        assertEquals(6.6, 2.2, '/');
        System.out.println(8.8);
    }

    @Test
    void divisionCheckByZero() {
        assertEquals(6.0, 0, '/');
    }
}
