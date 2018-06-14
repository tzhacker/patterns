package com.yrml.multition;

/**
 * @author created by John Tan on 2018/6/14
 */
public class Caller {

  private static final int CALLER_NUMBER = 8;

  private static void randomCaller(){
    for (int i = 0; i < CALLER_NUMBER; i++) {
      MultitionPattern multitionPattern = MultitionPattern.getInstance();
      System.out.print("第" + (i+1) + "个调用：");
      multitionPattern.multitionInfo();
    }
  }

  private static void pointCaller(){
    for (int i = 0; i < CALLER_NUMBER; i++) {
      MultitionPattern multitionPattern = null;
      if(i < 3){
        multitionPattern = MultitionPattern.getInstance(0);
      } else if(i < 5){
        multitionPattern = MultitionPattern.getInstance(1);
      } else {
        multitionPattern = MultitionPattern.getInstance(2);
      }
      System.out.print("第" + (i+1) + "个调用：");
      multitionPattern.multitionInfo();
    }
  }

  public static void main(String[] args) {
    Caller.randomCaller();
    Caller.pointCaller();
  }
}
