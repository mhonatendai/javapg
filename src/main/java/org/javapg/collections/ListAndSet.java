package org.javapg.collections;

import java.util.*;

public class ListAndSet {
    public static void main(String[] args) {
        System.out.println("COLLECTIONS FRAMEWORK!");

        System.out.println("LIST");
        Collection<String> list = new ArrayList<>();

//add () returns a boolean of whether the addition was successful.
        System.out.println(list.add("Sparrow")); // prints true,
        System.out.println(list.add("Sparrow")); // prints true as well.
        System.out.println(list.add("Another")); // prints true as well.
        System.out.println();
        System.out.println(list);

//Uses a Predicate to remove with a condition.
        list.removeIf(s -> s.startsWith("A"));
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

        set.add("");
        set.removeIf(String::isEmpty); // s -> s.isEmpty()
        System.out.println(set);

        set.clear();  // empties the set.

        String[] arrayOriginal = new String[] {"a", "b", "c"};
        List<String> asList = Arrays.asList(arrayOriginal); // [a, b, c]
        List<String> fromOf = List.of(arrayOriginal); // [a, b, c]
        List<String> copyCreation = List.copyOf(asList); // [a, b, c]

        arrayOriginal[0] = "za";
        System.out.println(fromOf);
        System.out.println(copyCreation);
        System.out.println(asList);
        System.out.println();
//        fromOf.set(0,"t");  UnSupportedOperationException

//        What do you think?
        System.out.println("Integer List after removing integers and removing at index ...");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(2);
        integerList.add(1);
        integerList.remove(2); //Removes element at index 2.
        integerList.remove(Integer.valueOf(2)); //Removes the value 2, takes in the Integer object.

        System.out.println(integerList);

        List<String> listNewOne = new ArrayList<>();
        listNewOne.add("hawk");
        listNewOne.add("robin");
        Object[] objectArray = listNewOne.toArray();
        String[] stringArray = listNewOne.toArray(new String[0]); //initial array size, if it does not match, a new array is created.
        System.out.println("Elements of stringArray");
        System.out.println(Arrays.asList(stringArray));
        listNewOne.clear();
        System.out.println(objectArray.length); // 2
        System.out.println(stringArray.length); // prints 2 as well, the created arrays are simply copies but not related to the original list.

//        Queue and Deque
        System.out.println();
        System.out.println("DEALING with Queues");
        Queue<Integer> firstQueue = new LinkedList<>();
        System.out.println(firstQueue.add(25)); //throws exception when the queue is full eg ArrayBlockingQueue.
        System.out.println(firstQueue.offer(30)); // returns false when the queue is full.
    }
}