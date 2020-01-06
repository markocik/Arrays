package com.javafee.arrayvslinked;

public class MainMeasures {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        long startTime = System.nanoTime();
        long someOperations = 0, numberOfIterations = 0;
        while(numberOfIterations < 50) {
            while (someOperations < 1000000000)
                someOperations++;
            someOperations = 0;
            numberOfIterations++;
        }
        // Thread.sleep(5000);
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println("Operacja trwala: \t" + elapsedNanos / 1000000000 + "s");
        System.out.println("\t\t\t\t\t" + elapsedNanos / 1000 + "ms");
        System.out.println("\t\t\t\t\t" + elapsedNanos + "ns");
    }
}
