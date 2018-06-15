package com.yrml.factory.service.black;

import com.yrml.factory.service.Human;

/**
 * @author created by John Tan on 2018/6/15
 */
public abstract class AbstractBlackHuman implements Human {
  @Override
  public void sing() {
    System.out.println("黑人印度阿三...");
  }

  @Override
  public void talk() {
    System.out.println("黑人说话叽叽歪歪...");
  }

  @Override
  public void cry() {
    System.out.println("黑人总是乐极生悲...");
  }
}
