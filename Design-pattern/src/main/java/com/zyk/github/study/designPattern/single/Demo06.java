package com.zyk.github.study.designPattern.single;

/**
 * @author 凯少
 * @create 2021-12-27 9:10
 */
public class Demo06 {

    public static void main(String[] args) {
        Singleton06 singleton = Singleton06.getInstance();
        Singleton06 instance = Singleton06.getInstance();
        System.out.println(singleton == instance);
    }
}

//简单的单例设计模式（懒汉式-静态内部类）
class Singleton06 {

    //私有化构造器
    private Singleton06() {
    }

    public static class SingletonInstance {
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    //提供一个静态的共有方法,加入同步处理的代码，解决线程安全的问题
    public static Singleton06 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}