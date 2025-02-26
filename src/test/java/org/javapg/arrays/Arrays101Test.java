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

        int[] arr6 = {1, 2, 3, 4, 4};
        assertTrue(Arrays101.compareArrays(arr1, arr6) > 0);
    }

    @Test
    void testArraysEqual() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        assertEquals(-1, Arrays101.compareArraysWithMismatch(arr1, arr2));
    }

    @Test
    void testArraysDifferentAtBeginning() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 2, 3};
        assertEquals(0, Arrays101.compareArraysWithMismatch(arr1, arr2));
    }

    @Test
    void testArraysDifferentInMiddle() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 4, 3};
        assertEquals(1, Arrays101.compareArraysWithMismatch(arr1, arr2));
    }

    @Test
    void testArraysDifferentAtEnd() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        assertEquals(2, Arrays101.compareArraysWithMismatch(arr1, arr2));
    }

    @Test
    void testArraysDifferentLengthsFirstShorter() {
        int[] arr1 = {1, 2};
        int[] arr2 = {1, 2, 3};
        assertEquals(2, Arrays101.compareArraysWithMismatch(arr1, arr2));
    }

    @Test
    void testArraysDifferentLengthsSecondShorter() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2};
        assertEquals(2, Arrays101.compareArraysWithMismatch(arr1, arr2));
    }

    @Test
    void testArraysDifferentLengthsAndContents() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 4};
        assertEquals(1, Arrays101.compareArraysWithMismatch(arr1, arr2));
    }

    @Test
    void testEmptyArrays() {
        int[] arr1 = {};
        int[] arr2 = {};
        assertEquals(-1, Arrays101.compareArraysWithMismatch(arr1, arr2));
    }

    @Test
    void testFirstArrayEmpty() {
        int[] arr1 = {};
        int[] arr2 = {1, 2, 3};
        assertEquals(0, Arrays101.compareArraysWithMismatch(arr1, arr2));
    }

    @Test
    void testSecondArrayEmpty() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {};
        assertEquals(0, Arrays101.compareArraysWithMismatch(arr1, arr2));
    }

    @Test
    void testNullArrays() {
        int[] arr1 = null;
        int[] arr2 = null;
        assertThrows(NullPointerException.class, () -> Arrays101.compareArraysWithMismatch(arr1,arr2));
    }

    @Test
    void testFirstArrayNull() {
        int[] arr1 = null;
        int[] arr2 = {1,2,3};
        assertThrows(NullPointerException.class, () -> Arrays101.compareArraysWithMismatch(arr1,arr2));
    }

    @Test
    void testSecondArrayNull() {
        int[] arr1 = {1,2,3};
        int[] arr2 = null;
        assertThrows(NullPointerException.class, () -> Arrays101.compareArraysWithMismatch(arr1,arr2));
    }

}