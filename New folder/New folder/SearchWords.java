package com.kamal.classes;

import java.util.Random;
public class SearchWords {
    public static void main(String[] args) {
        String word = "Father francis fried fish for his friends in france";
        /*
            Search every character in the string and compare if it matches the character we are looking for
            if it does, create a counter that we can increment.
         */
        int counter = 0;
        int len = word.length();
        for(int c = 0; c < len; c++){
            if(word.charAt(c) == 'f'){
                counter++;
            }
        }
        System.out.println("The total number of f's found is " + counter);

        int score = 0;
        Random random = new Random();
        for(int i = 1; i <= 5; i++){
            int dice = 1 + random.nextInt(6);
            System.out.println(dice);
            if(dice % 2 == 0){
                score+=5;
            }
        }
        System.out.println("The total score is " + score);
    }
}
