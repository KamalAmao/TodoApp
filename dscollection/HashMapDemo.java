package com.kamal.classes.dscollection;

import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        /*
            .put(k, v) e.g
              - java will get the hashCode of the k e.g Objects.hashCode(england) = 1011
              - java will proceed to get index (hash & n-1) = 2;
              - Java will now locate index 2 in the bucket

            16buckets(0-15) - Each bucket has a LinkList
            [] - LinkedList(Node) - K, V, Hash and Next
            []
            [] - england, london, 1011, null
            []
            ...
            []
         */
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put(null, null);

        System.out.println(capitalCities);

        //size
//        System.out.println(capitalCities.size());

//        for (String i : capitalCities.keySet()) {
//            System.out.println(i);
//        }
//
//        // Print values
//        for (String i : capitalCities.values()) {
//            System.out.println(i);
//        }

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        // JAVA 8
        //capitalCities.entrySet().stream().forEach(System.out::println);


    }
}
