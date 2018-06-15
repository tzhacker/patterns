package com.yrml.factory.service.yellow.impl;

import com.yrml.factory.service.Human;

/**
 * @author created by John Tan on 2018/6/14
 */
public class BlackHuman implements Human {

  @Override
  public void laugh() {
    System.out.println("black laugh.");
  }

  @Override
  public void cry() {
    System.out.println("black cry.");
  }

  @Override
  public void talk() {
    System.out.println("black talk.");
  }
}
