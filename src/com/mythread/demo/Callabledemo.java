package com.mythread.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread4 implements Callable<String>{
    @Override
    public String call() throws Exception {
        for(int x=0;x<10;x++){
            System.out.println("********线程执行,x="+x);
        }
        return "线程执行完毕";
    }
}

public class Callabledemo {
    public static void main(String[] args) throws Exception {
        FutureTask<String>  task = new FutureTask<>(new MyThread4());
        new Thread(task).start();
        System.out.println("【线程返回数据】"+task.get());
    }
}
