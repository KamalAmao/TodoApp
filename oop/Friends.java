package com.kamal.classes.oop;

public class Friends {
    public static void main(String[] args) {
        String [] friends = {"JBoss", "Galeeb", "Belal", "Malik"};
        int[]scores = {2, 50, 100, 88};
        for(int i = 0; i < friends.length; i++){
            System.out.println(friends[i]);
        }

        for(String result : friends){ //enhanced loop
            System.out.println(result);
        }

        for(int result : scores){
            System.out.println(result);
        }

    }
}
