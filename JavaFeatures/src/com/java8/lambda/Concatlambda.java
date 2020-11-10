package com.java8.lambda;

public class Concatlambda {
    public static void main(String[] args) {
        ConcatStrings concatStrings= (a,b)-> a+" "+b;
        System.out.println(concatStrings.stringConcatenate("Hello","World"));
    }
}
