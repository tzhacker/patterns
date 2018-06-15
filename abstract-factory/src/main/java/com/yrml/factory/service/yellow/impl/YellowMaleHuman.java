package com.yrml.factory.service.yellow.impl;

import com.yrml.factory.service.yellow.AbstractYellowHuman;

/**
 * @author created by John Tan on 2018/6/15
 */
public class YellowMaleHuman extends AbstractYellowHuman {

  @Override
  public void sex() {
    System.out.println("男性黄种人");
  }
}
