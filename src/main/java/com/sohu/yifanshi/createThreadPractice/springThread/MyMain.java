package com.sohu.yifanshi.createThreadPractice.springThread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {
    public static void main(String[] args) {//springע��ʽ�Ĵ����̡߳�����Asyncע�⣬��������עΪһ���첽���߳�����
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        DemoService de = ac.getBean(DemoService.class);
        de.a();
        de.b();
    }
}
