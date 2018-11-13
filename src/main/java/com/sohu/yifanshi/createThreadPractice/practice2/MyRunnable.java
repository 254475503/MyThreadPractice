package com.sohu.yifanshi.createThreadPractice.practice2;

public class MyRunnable implements Runnable {//实现runnable接口作为线程任务
    @Override
    public void run() {
        for(int i = 0 ; i< 100 ; i++)
        {
            System.out.println(i);
        }
    }
}
