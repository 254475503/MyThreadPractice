package com.sohu.yifanshi.createThreadPractice.practice4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThread implements Callable<Integer> {

    public Integer call() throws Exception {
        System.out.println("Calculating...");
        Thread.sleep(3000);
        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //使用FutureTask创建线程。FutureTask的线程任务为实现了callable接口的类。这是一个带有返回值的线程任务。
        //FutureTask是实现了Runnable和Future接口的类。也就是说他其实可以看作Runnable的一个和future封装在一起的封装类。所以我们可以
        //把FutureTask当作一个线程任务丢给线程。
        CallableThread callableThread = new CallableThread();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callableThread);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println("do other things");
        Integer integer = futureTask.get();
        System.out.println("futureTask运算结果为"+integer);
    }
}
