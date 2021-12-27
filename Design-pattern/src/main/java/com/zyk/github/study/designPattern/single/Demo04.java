package com.zyk.github.study.designPattern.single;

/**
 * @author 凯少
 * @create 2021-12-27 9:10
 */
public class Demo04 {

    public static void main(String[] args) {
        Singleton04 singleton = Singleton04.getInstance();
        Singleton04 instance = Singleton04.getInstance();
        System.out.println(singleton == instance);
    }
}

//简单的单例设计模式（懒汉式-线程同步：简单同步方法）
class Singleton04 {

    private static Singleton04 singleton;

    //私有化构造器
    private Singleton04() {

    }

    //提供一个静态的共有方法,加入同步处理的代码，解决线程安全的问题
    public static synchronized Singleton04 getInstance() {
        if (null == singleton) {
            singleton = new Singleton04();
        }
        return singleton;
    }
}