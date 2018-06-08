package com.yrml.singleton.normal;

/**
 * 懒汉在多线程场景下，线程非安全
 * @author created by John Tan on 2018/5/27
 */
public class SingletonPattern {

    private static SingletonPattern singletonPattern = null;

    private SingletonPattern() {
    }

    public static synchronized SingletonPattern getInstance(){
        if(singletonPattern == null){
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
}
