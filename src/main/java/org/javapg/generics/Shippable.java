package org.javapg.generics;

//Defines something that can be shipped.... Why not use an interface?
//Flexibility -  Generics can work with different types without needing to know those types at compile time.
//Type Safety -  Early, at compile time.
//Code Reusability - You can write the Shippable interface and method once, and then reuse it for any type of object you want to ship
//Clarity and Readability
public interface Shippable<T> {

void ship(T t);

}