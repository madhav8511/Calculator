package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    double epsilon = 0.001;

    @Test
    public void testAdd() {
        assertEquals(10.0, Main.add(5.0, 5.0), epsilon);
    }
}
