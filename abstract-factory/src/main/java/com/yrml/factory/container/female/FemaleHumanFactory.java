package com.yrml.factory.container.female;

import com.yrml.factory.container.AbstractHumanFactory;
import com.yrml.factory.enums.HumanEnum;
import com.yrml.factory.service.Human;

/**
 * @author created by John Tan on 2018/6/15
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

  @Override
  public Human createYellowHuman() {
    return createHuman(HumanEnum.YellowFemaleHuman);
  }

  @Override
  public Human createWhiteHuman() {
    return createHuman(HumanEnum.WhiteFemaleHuman);
  }

  @Override
  public Human createBlackHuman() {
    return createHuman(HumanEnum.BlackFemaleHuman);
  }
}
