package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    double epsilon = 0.001;

    @Test
    public void testAdd() {
        assertEquals(10.0, Main.add(5.0, 5.0), epsilon);
    }

    @Test
    public void testSquareroot() {
        assertEquals(5,Main.square_root(25),epsilon);
        assertEquals(-1,Main.square_root(-1),epsilon);
    }

    @Test
    public void testFactorial() {
        assertEquals(120,Main.factorial(5),epsilon);
        assertEquals(-1,Main.factorial(-1),epsilon);
    }

    @Test
    public void testPower() {
        assertEquals(125,Main.power(5,3),epsilon);
        assertEquals(-1,Main.power(-1,3),epsilon);
    }

    @Test
    public void testLogarithm() {
        assertEquals(1.609,Main.logarithm(5),epsilon);
        assertEquals(-1,Main.logarithm(-1),epsilon);
    }
}
