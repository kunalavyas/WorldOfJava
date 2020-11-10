package com.java8.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = ()->{
            return "Hello World by Lambda";
        };
        HelloWorldInterface helloWorldInterfaceSimplified= ()-> "Hello World from Simplified";

        System.out.println(helloWorldInterface.sayHelloWorld());
        System.out.println(helloWorldInterfaceSimplified.sayHelloWorld());
    }
}
