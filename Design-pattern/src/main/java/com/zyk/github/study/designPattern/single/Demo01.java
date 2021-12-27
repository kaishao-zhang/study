package com.zyk.github.study.designPattern.single;

/**
 * @author 凯少
 * @create 2021-12-27 9:10
 */
public class Demo01 {

    public static void main(String[] args) {
        Singleton01 singleton = Singleton01.getInstance();
        Singleton01 instance = Singleton01.getInstance();
        System.out.println(singleton == instance);
    }
}

//简单的单例设计模式（饿汉式-静态变量）
class Singleton01 {

    private final static Singleton01 singleton = new Singleton01();

    //私有化构造器
    private Singleton01() {

    }

    //提供一个静态获取类的方法
    public static Singleton01 getInstance() {
        return singleton;
    }
}