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

    @Test
    public void testCompareArrays() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        assertEquals(0, Arrays101.compareArrays(arr1, arr2));

        int[] arr3 = {5, 4, 3, 2, 1};
        assertTrue(Arrays101.compareArrays(arr1, arr3) < 0);

        int[] arr4 = {1, 2, 3, 4, 6};
        assertTrue(Arrays101.compareArrays(arr1, arr4) < 0);
    }
}