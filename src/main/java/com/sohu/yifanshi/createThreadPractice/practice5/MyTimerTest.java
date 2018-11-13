package com.sohu.yifanshi.createThreadPractice.practice5;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTest {
    public static void main(String[] args) {//定时任务实现线程。定时任务可以指定线程延迟多久开始执行，没隔多久执行一次，
        //以后可以学习quartz框架去更好的使用定时任务
        Timer timer = new Timer();
        timer.schedule(
                new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer is Running");
            }
        },0,1000);
    }
}
