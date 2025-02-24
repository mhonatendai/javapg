package org.javapg.arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Arrays101Test {


    /**
     * Test case to verify the behavior of the printNullArray method when 'names' array is not initialized.
     */
    @Test
    public void testPrintNullArray() {
        Arrays101 arrays101 = new Arrays101();
        arrays101.printNullArray();

        // Since the 'names' array is not initialized, it should print null
        // We can capture the output and assert that it contains "null"
        // This test will pass if the output contains "null"
        // You can modify this assertion based on your specific requirements
        assertEquals("null", getConsoleOutput());
    }

    /**
     * Helper method to capture the console output.
     *
     * @return The captured console output as a string.
     */
    private String getConsoleOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Arrays101 arrays101 = new Arrays101();
        arrays101.printNullArray();

        System.setOut(System.out);

        return outputStream.toString().trim();
    }
}