package com.sohu.yifanshi.createThreadPractice.practice3;

public class MyTest {
    public static void main(String[] args) {//�����ڲ��ഴ���߳�
        new Thread("Thread1"){//�����ڲ���̳�thread
            @Override
            public void run() {
                while (true)
                {
                    System.out.println(currentThread().getName()+"is Running");
                }
            }
        }.start();
        new Thread("Thread2"){
            @Override
            public void run() {
                while (true)
                {
                    System.out.println(currentThread().getName()+"is Running");
                }
            }
        }.start();

        new Thread(new Runnable() {//�����ڲ��ഫ��һ��ʵ����runnable�ӿڵ������ڲ�����Ϊ��������
            @Override
            public void run() {
                System.out.println("runnable is running");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable is running");
            }
        }){
            @Override
            public void run() {
                System.out.println("thread is running");
            }
        }.start();//�����ִ����һ��run�����أ��������������thread���е�run������
        //public void run() {
        //        if (target != null) {
        //            target.run();
        //        }
        //    }
        //�����targetָ�ľ���ʵ����runnable�ӿڵ��߳������������û����дrun����������run�����е�super.runû��ɾ������ô����
        //����ȥ�ж�target����ʱ���Ǵ�����target���ִ�������run������������д��run����������ִ������ġ�
    }
}
