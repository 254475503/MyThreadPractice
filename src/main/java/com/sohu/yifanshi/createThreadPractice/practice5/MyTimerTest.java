package com.sohu.yifanshi.createThreadPractice.practice5;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTest {
    public static void main(String[] args) {//��ʱ����ʵ���̡߳���ʱ�������ָ���߳��ӳٶ�ÿ�ʼִ�У�û�����ִ��һ�Σ�
        //�Ժ����ѧϰquartz���ȥ���õ�ʹ�ö�ʱ����
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
