package com.mythread.demo;


class MyThread3 implements Runnable{
    private int ticket=5;
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if(this.ticket>0){
                System.out.println("卖票，ticket="+this.ticket--);
            }
        }
    }
}
public class ShowTicket {
    public static void main(String[] args) {
    MyThread3 thread3 = new MyThread3();
    new Thread(thread3).start();
        new Thread(thread3).start();
        new Thread(thread3).start();
    }
}
