package com.java8.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        //Traditional Approach
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                int sum=0;
                for(int i=0;i<10;i++){
                    sum+=i;
                }
                System.out.println("Traditional: "+sum);
            }
        };
        new Thread(runnable).start();
        //Implementation with Lambda
        Runnable runnableLambda=()->{
            int sum=0;
            for(int i=0;i<10;i++){
                sum+=i;
            }
            System.out.println("Lambda: "+sum);
        };
        new Thread(runnableLambda).start();
        //Implement Thread with lambda

        new Thread(()->{ int sum=0;
            for(int i=0;i<10;i++){
                sum+=i;
            }
            System.out.println("Lambda in Thread: "+sum);}).start();
    }
}
