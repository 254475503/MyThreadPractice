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
        //ʹ��FutureTask�����̡߳�FutureTask���߳�����Ϊʵ����callable�ӿڵ��ࡣ����һ�����з���ֵ���߳�����
        //FutureTask��ʵ����Runnable��Future�ӿڵ��ࡣҲ����˵����ʵ���Կ���Runnable��һ����future��װ��һ��ķ�װ�ࡣ�������ǿ���
        //��FutureTask����һ���߳����񶪸��̡߳�
        CallableThread callableThread = new CallableThread();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callableThread);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println("do other things");
        Integer integer = futureTask.get();
        System.out.println("futureTask������Ϊ"+integer);
    }
}
