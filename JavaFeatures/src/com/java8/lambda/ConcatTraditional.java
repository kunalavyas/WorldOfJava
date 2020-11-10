package com.java8.lambda;

public class ConcatTraditional implements  ConcatStrings {
    @Override
    public String stringConcatenate(String one, String two) {
        return one + " "+two;
    }

    public static void main(String[] args) {
        ConcatTraditional concatTraditional= new ConcatTraditional();
        System.out.println(concatTraditional.stringConcatenate("Hello", "World!"));
    }
}
