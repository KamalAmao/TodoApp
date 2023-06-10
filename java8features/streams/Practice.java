package com.kamal.classes.java8features.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        // Print even numbers
//        int [] numbers = {2, 5, 6, 7, 8, 9};
        // convert it to Stream
//        int maxValue = Arrays.stream(numbers).max().getAsInt();
//        System.out.println(maxValue);

//        Arrays.stream(numbers).filter(num -> num%2 == 0).forEach(System.out::println);
//
//        List<Employee> employees = Stream.of(
//                new Employee(1, "JBoss", "DEV", 1000000),
//                new Employee(2, "Roy", "QA", 10000),
//                new Employee(3, "Rhema", "DEV", 100000)
//        ).collect(Collectors.toList());
//
//        Map<String, List<Employee>> temp = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
//        System.out.println(temp);

//        employees.stream()
//                .filter(employee -> employee.getSalary() > 10000)
//                .forEach(System.out::println);

//        employees.stream()
//                .filter(employee -> employee.getSalary() > 10000)
//                .map(employee -> employee.getName())
//                .forEach(System.out::println);

//        employees.stream()
//                .filter(employee -> employee.getSalary() > 10000)
//                .map(Employee::getName)
//                .forEach(System.out::println);


//        System.out.println(employees);

        /*
            1. Java Program to count the occurrence of each character in a String
            e.g iloveJboss
            i=1, l=1, 0=2, v=1, ..s=2

            2. Java Program to find duplicate element in a given string
                result = {o, s]

            3. Java Program to find unique element in a given string
               [b, e, v, i, J, l]

            4. Write a Java to find first non-repeat element in a given string
               [l]

            5. Write a Java to find first repeat element in a given string
               [o]

           ASSIGNMENT
           Write a Java Program to find the second highest number from a given array
           int[]numbers = {5,9,11,2,8,21,1}

           = 11;

         */

        String input = "iloveJboss";
//        String[]result = input.split("");
//        System.out.println(Arrays.toString(result));
//        Map<String, List<String>> map = Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy(s -> s));

        //solution 1
//        Map<String, Long> map = Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        System.out.println(map);

        //solution 2
//        Map<String, Long> map = Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        List<String> duplicateElementKey = map.entrySet().stream()
//                .filter(x->x.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());

//        Map<String, Long> duplicateElementKeyValue = map.entrySet().stream()
//                .filter(x->x.getValue() > 1)
//                .collect(Collectors.toMap(x->x.getKey(), x-> x.getValue()));

//        List<String> result3 = Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream()
//                .filter(x->x.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//
//
//        System.out.println(duplicateElementKey);


        //solution 3
//        List<String> uniqueElement = Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream()
//                .filter(x->x.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//
//
//        System.out.println(uniqueElement);

        //solution 4
//        String firstNonRepeat = Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream()
//                .filter(x->x.getValue() == 1)
//                .findFirst().get().getKey();
//
//
//        System.out.println(firstNonRepeat);

        //solution 5
        String firstRepeat = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue() > 1)
                .findFirst().get().getKey();


        System.out.println(firstRepeat);
    }
}
