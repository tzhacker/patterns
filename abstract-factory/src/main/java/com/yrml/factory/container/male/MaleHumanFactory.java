package com.yrml.factory.container.male;

import com.yrml.factory.container.AbstractHumanFactory;
import com.yrml.factory.enums.HumanEnum;
import com.yrml.factory.service.Human;

/**
 * @author created by John Tan on 2018/6/15
 */
public class MaleHumanFactory extends AbstractHumanFactory {

  @Override
  public Human createYellowHuman() {
    return createHuman(HumanEnum.YellowMaleHuman);
  }

  @Override
  public Human createWhiteHuman() {
    return createHuman(HumanEnum.WhiteMaleHuman);
  }

  @Override
  public Human createBlackHuman() {
    return createHuman(HumanEnum.BlackMaleHuman);
  }
}
