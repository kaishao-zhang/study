package com.zyk.github.study.designPattern.single;

/**
 * @author 凯少
 * @create 2021-12-27 9:10
 */
public class Demo05 {

    public static void main(String[] args) {
        Singleton05 singleton = Singleton05.getInstance();
        Singleton05 instance = Singleton05.getInstance();
        System.out.println(singleton == instance);
    }
}

//简单的单例设计模式（懒汉式-线程同步：双重检测）
class Singleton05 {

    private static volatile Singleton05 singleton;

    //私有化构造器
    private Singleton05() {

    }

    //提供一个静态的共有方法,加入同步处理的代码，解决线程安全的问题
    public static Singleton05 getInstance() {
        if (null == singleton) {
            synchronized (Singleton05.class) {
                if (null == singleton) {
                    singleton = new Singleton05();
                }
            }
            singleton = new Singleton05();
        }
        return singleton;
    }
}