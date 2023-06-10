package com.kamal.classes.dscollection;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo {
    public static void main(String[] args) {
        /*
         Wrapper class(Integer, Double etc) and Primitive type(int, double etc)
         <> type generic could be a wrapper class or Object(Car)
         add(), get(), addAll(), set(), size()
         */
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("Bmw");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Benz");


        ArrayList<String> houses = new ArrayList<>();

        houses.add("bungalow");
        houses.add("duplex");

        cars.addAll(houses);
        Collections.sort(cars);
        String volvoPlural = cars.get(0) + "s";


//        System.out.println(cars.get(1));
//        System.out.println(cars.size());
//        cars.set(0, "Opel");
//        System.out.println(cars.get(0));

//
//        for(int i = 0; i < cars.size(); i++){
//            System.out.println(cars.get(i));
//        }

        //for-each loop:
        for(String result : cars){
            System.out.println(result);
        }

    }
}
