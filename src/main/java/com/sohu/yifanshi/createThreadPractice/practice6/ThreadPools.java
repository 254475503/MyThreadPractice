package com.sohu.yifanshi.createThreadPractice.practice6;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPools {
    public static void main(String[] args) {
        ExecutorService executable = Executors.newCachedThreadPool();
        for(int i = 0 ; i<100 ; i++)
        {
            executable.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"running");
                }
            });
        }
        executable.shutdown();

    }
}
