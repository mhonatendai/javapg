package org.javapg.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ListAndSet {
    public static void main(String[] args) {
        System.out.println("COLLECTIONS FRAMEWORK!");

        System.out.println("LIST");
        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); // prints true, add () returns a boolean of whether the addition was successful.
        System.out.println(list.add("Sparrow")); // prints true as well.
        System.out.println(list.add("Another")); // prints true as well.
        System.out.println();
        System.out.println(list);
        list.removeIf(s -> s.startsWith("A"));// Uses a predicate to remove with a condition.
        System.out.println(list);

        System.out.println();
        System.out.println("SET");
        Collection<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow")); // Prints true as well
        System.out.println(set.add("Sparrow")); // Prints false as a set does not allow duplicates.
        set.add("Test");
        System.out.println(set.remove("Test1")); // false
        System.out.println(set.remove("Sparrow")); //true

        System.out.println(set.contains("Test1"));  // false
        System.out.println(set.contains("Test"));  // true

        System.out.println(set.isEmpty());  //false, because the set is not empty.
        System.out.println(set.size());     // number of elements in the set.

        set.clear();  // empties the set.
    }
}