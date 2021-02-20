package com.liuscoding.springcloud.alibaba.controller;

public class LearnHeap {
    // 无论是否添加 volatile 关键字，结果都是 10000 咧!!
     public volatile int inc = 0;
    //public int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final LearnHeap test = new LearnHeap();
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++){
                    test.increase();
                    System.out.println("test.inc"+test.inc);
                }

            }).start();
        }

//        while (Thread.activeCount() > 1)  //保证前面的线程都执行完
//            Thread.yield();

        System.out.println(test.inc);
    }
}
