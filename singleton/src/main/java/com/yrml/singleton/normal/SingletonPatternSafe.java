package com.yrml.singleton.normal;

/**
 * 饿汉模式在多线程下，加上synchronized就能保证线程安全
 * @author created by John Tan on 2018/5/27
 */
public class SingletonPatternSafe {

    private static SingletonPatternSafe singletonPatternSafe = new SingletonPatternSafe();

    private SingletonPatternSafe() {
    }

    public synchronized SingletonPatternSafe getInstance(){
        return singletonPatternSafe;
    }
}
