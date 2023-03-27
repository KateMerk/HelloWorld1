package Lesson4;

import java.awt.*;

public class Car {
    Car(int price){
        System.out.println(price);
    }
    Color color;
    String model;

    public static void main(String[] args) {
        Car bmwx6,audiA8;
        bmwx6= new Car(200_000);
        bmwx6.color= Color.BLACK;
        bmwx6.model= "BMW X6";
        audiA8 = new Car(100000);
        audiA8.color= Color.ORANGE;
        audiA8.model= "Audi A8";

    }
}


