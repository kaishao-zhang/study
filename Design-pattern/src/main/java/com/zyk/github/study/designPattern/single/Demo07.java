package com.zyk.github.study.designPattern.single;

/**
 * @author 凯少
 * @create 2021-12-27 9:10
 */
public class Demo07 {

    public static void main(String[] args) {
        Singleton07 singleton = Singleton07.SINGLETON;
        Singleton07 instance = Singleton07.SINGLETON;
        System.out.println("singleton = " + singleton.hashCode());
        System.out.println("instance = " + instance.hashCode());
        System.out.println(singleton == instance);
    }
}

//简单的单例设计模式（懒汉式-静态内部类）
enum Singleton07 {
    SINGLETON;
}