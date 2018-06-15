package com.yrml.factory.enums;

/**
 * @author created by John Tan on 2018/6/15
 */
public enum  HumanEnum {

  /**
   * 女性黑人
   */
  BlackFemaleHuman("com.yrml.factory.service.black.impl.BlackFemaleHuman"),
  BlackMaleHuman("com.yrml.factory.service.black.impl.BlackMaleHuman"),
  WhiteFemaleHuman("com.yrml.factory.service.white.impl.WhiteFemaleHuman"),
  WhiteMaleHuman("com.yrml.factory.service.white.impl.WhiteMaleHuman"),
  YellowFemaleHuman("com.yrml.factory.service.yellow.impl.YellowFemaleHuman"),
  YellowMaleHuman("com.yrml.factory.service.yellow.impl.YellowMaleHuman");

  private String value;

  HumanEnum(final String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
