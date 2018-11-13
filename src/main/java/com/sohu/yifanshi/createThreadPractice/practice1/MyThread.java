package com.sohu.yifanshi.createThreadPractice.practice1;

public class MyThread extends Thread {//ºÃ≥–Thread¿‡
    @Override
    public void run() {
        for(int i = 0; i <100 ;i++)
        {
            System.out.println(currentThread().getName()+" - "+i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.start();
        myThread1.start();
    }
}
