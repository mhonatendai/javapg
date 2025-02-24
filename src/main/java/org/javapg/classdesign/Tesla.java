package org.javapg.classdesign;

public class Tesla extends Car{

//    protected int speed = 20;

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        var tesla = new Tesla();
        System.out.println(tesla.getSpeed());
            for(int i = 1;i<=15;i++){
                if(i%3==0 & i%5==0){
                    System.out.println("FizzBuzz");
                }else if(i%3==0 & !(i%5==0)){
                    System.out.println("Fizz");
                }else if(i%5==0 & !(i%5==0)){
                    System.out.println("Fizz");
                }else{
                    System.out.println(i);
                }
            }


    }
}
