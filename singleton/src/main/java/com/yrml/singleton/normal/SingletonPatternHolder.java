package com.yrml.singleton.normal;

/**
 * @author created by John Tan on 2018/6/8
 */
public class SingletonPatternHolder {

  private static class Holder {
    private static final SingletonPatternHolder INSTANCE = new SingletonPatternHolder();
  }

  private SingletonPatternHolder() {
  }

  public static SingletonPatternHolder getInstance(){
    return Holder.INSTANCE;
  }

}
