package com.yrml.singleton.demo;

/**
 * 单例模式->饿汉模式
 * @author created by John Tan on 2018/5/27
 */
public class Visitor {

    public static void main(String[] args) {

        Master master = Master.getInstance();
        System.out.println("Fist: " + master);
        System.out.println(master.masterInfo());

        Master master1 = Master.getInstance();
        System.out.println("Second: " + master1);
        System.out.println(master1.masterInfo());
    }
}
