package com.mythread.demo;

class MyThread2 implements Runnable{
    private String title;
    public MyThread2(String title){
        this.title = title;
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(this.title+"运行，i="+i);
        }
    }
}

public class ByRunnableThread {

    public static void main(String[] args) {
      /*  Thread threadA = new Thread(new MyThread2("线程对象A"));
        Thread threadB = new Thread(new MyThread2("线程对象B"));
        Thread threadC = new Thread(new MyThread2("线程对象C"));
        threadA.start();   //启动多线程
        threadB.start();   //启动多线程
        threadC.start();   //启动多线程*/
      for(int i=0;i<3;i++){
          String title = "线程对象-"+i;
          Runnable run = ()->{
              for(int y=0;y<10;y++){
                  System.out.println(title+"运行，y="+y);
              }
          };
          new Thread(run).start();
      }
    }
}
