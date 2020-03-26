package com.mythread.demo;

public class ThreadSleep {
    public static void main(String[] args) throws Exception {
        for (int num = 0; num < 5; num++) {
            new Thread(() -> {
                for (int x = 0; x < 10; x++) {
                    System.out.println(Thread.currentThread().getName() + ",x=" + x);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "线程对象-"+num).start();
        }
    }
}
