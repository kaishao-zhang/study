package com.zyk.github.study.designPattern.single;

/**
 * @author 凯少
 * @create 2021-12-27 9:10
 */
public class Demo03 {

    public static void main(String[] args) {
        Singleton03 singleton = Singleton03.getInstance();
        Singleton03 instance = Singleton03.getInstance();
        System.out.println(singleton == instance);
    }
}

//简单的单例设计模式（懒汉式-线程不安全）
class Singleton03 {

    private static Singleton03 singleton;

    //私有化构造器
    private Singleton03() {

    }

    //提供一个静态获取类的方法,当时用到该方法时，才去创建instance
    public static Singleton03 getInstance() {
        if (null == singleton) {
            singleton = new Singleton03();
        }
        return singleton;
    }
}