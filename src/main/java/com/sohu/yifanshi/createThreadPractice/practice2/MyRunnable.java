package com.sohu.yifanshi.createThreadPractice.practice2;

public class MyRunnable implements Runnable {//ʵ��runnable�ӿ���Ϊ�߳�����
    @Override
    public void run() {
        for(int i = 0 ; i< 100 ; i++)
        {
            System.out.println(i);
        }
    }
}
