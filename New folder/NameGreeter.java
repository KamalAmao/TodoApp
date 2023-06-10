package com.kamal.classes;

import java.util.Scanner;
public class NameGreeter {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Kindly provide me your name and i will greet you");
        String username = x.next();
        System.out.println("Hello " + username);
    }
}
