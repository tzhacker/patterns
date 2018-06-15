package com.yrml.factory.service.white;

import com.yrml.factory.service.Human;

/**
 * @author created by John Tan on 2018/6/15
 */
public abstract class AbstractWhiteHuman implements Human {

  @Override
  public void sing() {
    System.out.println("白人手舞足蹈...");
  }

  @Override
  public void talk() {
    System.out.println("白人说话侵略性极强，Fuck...");
  }

  @Override
  public void cry() {
    System.out.println("白人伤痛欲绝...");
  }
}
