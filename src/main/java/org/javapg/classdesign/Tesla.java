package org.javapg.classdesign;

public class Tesla extends Car{

//    protected int speed = 20;

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        var tesla = new Tesla();
        System.out.println(tesla.getSpeed());
    }
}
