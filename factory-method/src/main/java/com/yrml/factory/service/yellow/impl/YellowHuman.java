package com.yrml.factory.service.yellow.impl;

import com.yrml.factory.service.Human;

/**
 * @author created by John Tan on 2018/6/14
 */
public class YellowHuman implements Human {

  @Override
  public void laugh() {
    System.out.println("谈笑风生");
  }

  @Override
  public void cry() {
    System.out.println("痛苦伤悲");
  }

  @Override
  public void talk() {
    System.out.println("欢声笑语");
  }
}
