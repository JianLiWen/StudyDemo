package com.mythread.demo;

class MyThread6 implements Runnable{
    private int ticket = 10;
    public synchronized boolean sale(){
        if(ticket>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"卖票，ticket="+this.ticket--);
            return true;
        }else{
            System.out.println("卖光了");
            return false;
        }
    }
    @Override
    public void run() {
        while(this.sale()){
            ;
        }
    }
}
public class ThreadSyn{
    public static void main(String[] args) throws Exception {
        MyThread6 mt = new MyThread6();
        new Thread(mt,"票贩子a").start();
        new Thread(mt,"票贩子b").start();
        new Thread(mt,"票贩子c").start();
    }

}
