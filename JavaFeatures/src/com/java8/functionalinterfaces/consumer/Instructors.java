package com.java8.functionalinterfaces.consumer;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll() {
    Instructor instructor1= new Instructor("Mike", 10, "Software Developer","M",true, Arrays.asList("Java","C++","Python"));
    Instructor instructor2= new Instructor("Jenny", 5, "Engineer","F",false, Arrays.asList("Multithreaded Programming","CI-CD","Unit Testing"));
    Instructor instructor3= new Instructor("Gene", 6, "Manager","M",false, Arrays.asList("C++ Programming","C Programming","React Native"));
    Instructor instructor4= new Instructor("Anthony", 15, "Senor Developer","M",true, Arrays.asList("Java programming","Angular Programming","React Native"));
    Instructor instructor5= new Instructor("Sayed", 15, "Principal Engineer","M",true, Arrays.asList("Java","Java Multithreaded","React Native"));

    List<Instructor> list= Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5);
    return list;
    }
}
