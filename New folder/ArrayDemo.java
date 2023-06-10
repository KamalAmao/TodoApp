package com.kamal.classes;

public class ArrayDemo {
    public static void main(String[] args) {
        float[]studentScore = new float[3];

        studentScore[0] = (float) 23.5;
        studentScore[1] = (float) 22.5;
        studentScore[2] = (float) 13.5;


        int [] age = {22, 34, 56, 78};
        // Add up the element at index 1 and 3
        int result = age[1] + age[3];
        System.out.println("The sum of age at index 1 and 3 is " + result);
        System.out.println(age[2]);
        String rainRemark = (age[3] > 100) ? "It will rain" : "Not gonna rain";
        System.out.println(rainRemark);

        String [] friends = {"Sam", "Lillian", "Kamal", "Mayor"};
        System.out.println(friends[2]);
        System.out.println("Total elements in Friends array is " + friends.length); // count all elements in friends array


    }
}
