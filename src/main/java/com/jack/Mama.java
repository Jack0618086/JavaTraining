package com.jack;

public class Mama {
    public Mama() {
        System.out.println(Thread.currentThread().getName());
        try {
            System.out.println("Cooking dish #1");
            Thread.sleep(5000);
            System.out.println("Finished dish #1");
            System.out.println("Cooking dish #2");
            System.out.println(Thread.currentThread().getName());

            new Thread(){
                @Override
                public void run() {
                    MingThread ming = new MingThread();
                    ming.start();
                }
            }.start();

            /*MingThread ming = new MingThread();
            ming.start();*/

            Thread.sleep(5000);
            System.out.println("Finished dish #2");
            System.out.println("Cooking dish #3");
            Thread.sleep(5000);
            System.out.println("Finished dish #3");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new Mama();
    }
}