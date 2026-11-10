package com.binil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testAddition() {
        int result = Main.add(10, 20);

        assertEquals(30, result);
    }
}
