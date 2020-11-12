package com.java8.functionalinterfaces.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleWithInstructor {

    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();
        //Looping through all instructors and printing value of instructors
        Consumer<Instructor> c1 = (s1) -> System.out.println(s1);
        instructorList.forEach(c1);
        System.out.println("-----------------------");
        //Loop through all the instructors and only print their names
        Consumer<Instructor> c2= instructor -> System.out.println(instructor.getName());
        instructorList.forEach(c2);
        System.out.println("-----------------------");
        // Loop through all the instructors and  print their names and courses
        Consumer<Instructor> c3= instructor -> System.out.println(instructor.getCourses());
        instructorList.forEach(c2.andThen(c3));

        //Loop through all the instructors and print their name depending on their experience >10
        System.out.println("-----------------------");
        instructorList.forEach(t1->{
            if(t1.getYearsOfExperience()>10){
                c1.accept(t1);
            }
        });

        //Loop through all the constructors and print their name and years of experience if experience >5 and not teaches course online
        System.out.println("-----------------------");
        instructorList.forEach(t1->{
            if(t1.getYearsOfExperience() >5 && !t1.isOnlineCourses()){
                c1.andThen(c2).accept(t1);
            }
        });
    }

}
