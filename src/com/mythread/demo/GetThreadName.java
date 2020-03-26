package com.mythread.demo;

class MyThread5 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class GetThreadName {
    public static void main(String[] args) {
        MyThread5 mt = new MyThread5();
        new Thread(mt,"线程A").start();
        new Thread(mt).start();
        new Thread(mt,"线程B").start();
        mt.run();

        System.out.println("执行操作任务1");
        new Thread(()->{    //子线程负责统计
            int temp = 0;
            for(int x=0;x<Integer.MAX_VALUE;x++){
                temp+=x;
            }
        });
        System.out.println("执行操作任务N");
    }
}
