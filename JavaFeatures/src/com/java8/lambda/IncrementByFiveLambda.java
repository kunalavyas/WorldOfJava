package com.java8.lambda;

public class IncrementByFiveLambda {
    public static void main(String[] args) {
        IncrementByFive incrementByFive= (num) -> num+5;
        System.out.println(incrementByFive.incrementByFive(5));
    }
}
