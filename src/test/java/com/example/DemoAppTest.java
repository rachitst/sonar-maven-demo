package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DemoAppTest {

    @Test
    public void testDivide() {
        int result = DemoApp.divide(100, 10);
        assertEquals(10, result);
    }
}
