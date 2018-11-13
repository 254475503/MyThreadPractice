package com.sohu.yifanshi.createThreadPractice.springThread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {
    public static void main(String[] args) {//spring注解式的创建线程。加上Async注解，将方法标注为一个异步的线程任务。
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        DemoService de = ac.getBean(DemoService.class);
        de.a();
        de.b();
    }
}
