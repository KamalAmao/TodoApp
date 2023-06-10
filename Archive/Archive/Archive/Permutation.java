package com.kamal.classes;

public class Permutation {
    public static void main(String[] args) {
        int n = 1;
        for(int i = 1; i <= 10; i++){
            n*=i;
        }

        int m = 1;
        for(int i = 1; i <= 3; i++){
            m*=i;
        }

        int perm = n/m;
        System.out.println(perm);
    }
}
