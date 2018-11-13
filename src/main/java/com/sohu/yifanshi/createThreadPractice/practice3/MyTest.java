package com.sohu.yifanshi.createThreadPractice.practice3;

public class MyTest {
    public static void main(String[] args) {//匿名内部类创建线程
        new Thread("Thread1"){//匿名内部类继承thread
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

        new Thread(new Runnable() {//匿名内部类传入一个实现了runnable接口的匿名内部类作为参数创建
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
        }.start();//这里会执行哪一个run方法呢？答案是下面这个。thread类中的run方法是
        //public void run() {
        //        if (target != null) {
        //            target.run();
        //        }
        //    }
        //这里的target指的就是实现了runnable接口的线程任务。如果我们没有重写run方法，或者run方法中的super.run没有删除。那么将会
        //优先去判断target，此时我们传入了target则会执行上面的run。但是这里重写了run方法，所以执行下面的。
    }
}
