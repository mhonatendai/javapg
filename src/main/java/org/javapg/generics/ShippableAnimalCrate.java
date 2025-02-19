package org.javapg.generics;

import java.util.ArrayList;
import java.util.List;

class ShippableAnimalCrate implements Shippable<Animal> {
    public void ship(Animal t) {
    }
/*
An example of an unbounded wildcard in generics.
 */
    public static void shipAnything(List<?> list) {
        for (Object x: list)
            System.out.println(x);

//        The line below does not compile but an upper-bounded wildcard can solve the issue.
//        ArrayList<Number> liste = new ArrayList<Integer>();


//        It says any class that extends Number or Number itself can be used as the formal parameter type
        List<? extends Number> listNumbers = new ArrayList<Integer>();
    }


}