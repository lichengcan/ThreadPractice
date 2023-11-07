package com.lcc.treadpractice;

/**
 * @author: lichengcan
 * @date: 2023-11-07 14:12
 * @description 线程类
 **/
public class ClimbTread extends Thread {

    //创建线程类

    //属性：爬100米时长，爬多少个100米
    //构造方法完成初始化
    private int time;//爬100米时长
    public int num = 0;//爬多少个100米

    public ClimbTread(String name, int time, int kilometer) {
        super(name);
        this.time = time;
        this.num = kilometer * 1000 / 100;
    }

    public void run() {

        while (num > 0) {

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "加油,你又跑完了100米");
            num--;
        }
        System.out.println("congratulations"+Thread.currentThread().getName()+"你跑完啦");
    }

    public static void main(String[] args) {
        ClimbTread climbTread = new ClimbTread("小灿", 500, 1);
        ClimbTread climbTread1 = new ClimbTread("jules", 1000, 1);
        climbTread.start();
        climbTread1.start();
    }

}
