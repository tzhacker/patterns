package com.yrml.factory.service.yellow.impl;

import com.yrml.factory.service.Human;

/**
 * @author created by John Tan on 2018/6/14
 */
public class WhiteHuman implements Human {

  @Override
  public void laugh() {
    System.out.println("laugh");
  }

  @Override
  public void cry() {
    System.out.println("cry");
  }

  @Override
  public void talk() {
    System.out.println("talk");
  }
}
