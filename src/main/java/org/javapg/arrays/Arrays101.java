package org.javapg.arrays;

import java.util.Arrays;

public class Arrays101 {
    static String[] names;

    public void printNullArray(){
        System.out.println(names); //Why it prints null, because it is just a reference to null.
    }

    public static int compareArrays(int[] arr1, int[] arr2) {
        return Arrays.compare(arr1, arr2);
    }
}