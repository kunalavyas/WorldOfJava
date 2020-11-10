package com.java8.lambda;

public class IncrementByFiveTraditional implements IncrementByFive {
    @Override
    public int incrementByFive(int num) {
        return num+5;
    }

    public static void main(String[] args) {
        IncrementByFiveTraditional incrementByFiveTraditional= new IncrementByFiveTraditional();
        System.out.println(incrementByFiveTraditional.incrementByFive(2));
    }
}
