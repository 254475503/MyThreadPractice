package com.sohu.yifanshi.createThreadPractice.practice2;

public class MyTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
    }
}
