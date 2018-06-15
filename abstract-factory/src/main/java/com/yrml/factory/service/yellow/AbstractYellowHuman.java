package com.yrml.factory.service.yellow;

import com.yrml.factory.service.Human;

/**
 * @author created by John Tan on 2018/6/15
 */
public abstract class AbstractYellowHuman implements Human {
  @Override
  public void sing() {
    System.out.println("黄种人尽情歌唱...");
  }

  @Override
  public void talk() {
    System.out.println("黄种人说话一般是双字节...");
  }

  @Override
  public void cry() {
    System.out.println("黄种人掩面而泣...");
  }
}
