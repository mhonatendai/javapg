package org.javapg.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ListAndSet {
    public static void main(String[] args) {
        System.out.println("COLLECTIONS FRAMEWORK!");

        System.out.println("LIST");
        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow"));
        System.out.println(list.add("Sparrow"));
        System.out.println();


        System.out.println("SET");
        Collection<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow"));
        System.out.println(set.add("Sparrow"));
    }
}