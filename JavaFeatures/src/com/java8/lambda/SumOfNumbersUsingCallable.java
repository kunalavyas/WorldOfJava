package com.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {
    public static int[] array= IntStream.rangeClosed(0,5000).toArray();
    public static int total= Arrays.stream(array).sum();

    public static void main(String[] args) throws Exception{
        Callable callable1= ()->{
            int sum=0;
            for(int i=0;i< array.length/2;i++){
                sum+=array[i];
            }
            return sum;
        };

        Callable callable2= ()->{
            int sum=0;
            for(int i=array.length/2 ;i< array.length;i++){
                sum+=array[i];
            }
            return sum;
        };
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList= Arrays.asList(callable1, callable2);
        List<Future<Integer>> results= executorService.invokeAll(taskList);

        int k=0;
        int sum=0;
        for(Future<Integer> result: results){
            sum+=result.get();
        }
        System.out.println("Sum of Array is :"+sum);
        System.out.println("Sum using IntStream is :"+total);
        executorService.shutdown();
    }

}
