package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    Counter counter;

    @BeforeEach
    void setUp() {
        counter = new Counter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIncrement() {
        int expected = 3;
        counter.increment();
        counter.increment();
        int actual = counter.increment();

        assertEquals(expected, actual);

        assertTrue(counter.increment() == 4);
    }

    @Test
    void testDecrement() {
        int expected = -4;
        counter.decrement();
        counter.decrement();
        counter.decrement();
        int actual = counter.decrement();
        assertEquals(expected, actual);
    }

    @Test
    void testNewCounter() {
        int expected = 0;
        int actual = counter.getValue();
        assertEquals(expected, actual, "New counter must contain value == 0");
    }
}