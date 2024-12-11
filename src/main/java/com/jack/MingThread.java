package com.jack;

public class MingThread extends Thread {
    @Override
    public void run() {
        System.out.println("Ming go buy soy source");
        try {
            sleep(7000);
            System.out.println("Ming is back with soy source");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}