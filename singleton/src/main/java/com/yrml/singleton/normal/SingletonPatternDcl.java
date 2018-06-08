package com.yrml.singleton.normal;

/**
 * @author created by John Tan on 2018/6/7
 */
public class SingletonPatternDcl {

  private static volatile SingletonPatternDcl singletonPatternDcl = null;

  private SingletonPatternDcl() {
  }

  public static SingletonPatternDcl getInstance(){
    if(singletonPatternDcl == null){                         //1、在实例化的情况下，不需要执行加锁动作，性能提高
      synchronized (SingletonPatternDcl.class){              //2、对类上锁，多个线程的情况下，只有一个线程能够创建对象
        if(singletonPatternDcl == null){                     //3、实例化对象为空的情况下创建对象
          singletonPatternDcl = new SingletonPatternDcl();   //4、创建对象
        }
      }
    }
    return singletonPatternDcl;
  }
}
