package com.kamal.classes.java8features;

import com.kamal.classes.java8features.streams.Employee;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FeatureTest {
    public static void main(String[] args) {


//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }
//
//        Runnable r1 = () -> System.out.println("Kamal");
//        Runnable runnable1 = () ->{
//
//
//        };

//       MyFunction myFunction =  (i) -> System.out.println("Test Method executed");
//       myFunction.test(15);

//        MyFunction myFunction = (i)->i*5;
//        System.out.println(myFunction.test(20));

//        MyFunction myFunction  = (s1, s2) -> s1 + " " + s2;
//        System.out.println(myFunction.testString("abc", "def"));

       Function<Integer, String> funt = (t) -> "output " + t;
        System.out.println(funt.apply(90));

    }
}
