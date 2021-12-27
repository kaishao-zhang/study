package com.zyk.github.study.designPattern.single;

/**
 * @author 凯少
 * @create 2021-12-27 9:10
 */
public class Demo02 {

    public static void main(String[] args) {
        Singleton02 singleton = Singleton02.getInstance();
        Singleton02 instance = Singleton02.getInstance();
        System.out.println(singleton == instance);
    }
}

//简单的单例设计模式（饿汉式-静态代码块）
class Singleton02 {

    private static Singleton02 singleton;

    //私有化构造器
    private Singleton02() {

    }

    static {
        singleton = new Singleton02();
    }

    //提供一个静态获取类的方法
    public static Singleton02 getInstance() {
        return singleton;
    }
}