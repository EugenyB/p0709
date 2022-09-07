package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyReaderTest {
    MyReader reader;

    @BeforeEach
    void setUp() throws IOException {
        reader = new MyReader("file.txt");
    }

    @AfterEach
    void tearDown() throws IOException {
        reader.close();
    }

    @Test
    void testReadText() throws IOException {
        String expected = "Hello, World!";
        String actual = reader.readLine();

        assertEquals(expected, actual);
    }

    @Test
    void testReadWord() throws IOException{
        String expected = "Hello";
        String actual = reader.readWord();

        assertEquals(expected, actual);

        assertEquals("World", reader.readWord());
    }

}
