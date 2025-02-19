package org.javapg.generics;

import java.util.List;

class ShippableAnimalCrate implements Shippable<Animal> {
    public void ship(Animal t) {
    }
/*
An example of an unbounded wildcard in generics.
 */
    public static void shipAnything(List<Object> list) {
        for (Object x: list)
            System.out.println(x);
    }


}