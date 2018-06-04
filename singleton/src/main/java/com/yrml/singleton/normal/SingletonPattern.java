package com.yrml.singleton.normal;

/**
 * 懒汉在多线程场景下，线程非安全
 * @author created by John Tan on 2018/5/27
 */
//@SuppressWarnings("all")
public class SingletonPattern {

    private static SingletonPattern singletonPattern = null;

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance(){
        // if这里存在竞态条件
        if(singletonPattern == null){
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
}
