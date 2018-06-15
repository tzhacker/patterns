package com.yrml.factory.maker;

import com.yrml.factory.container.HumanFactory;
import com.yrml.factory.container.female.FemaleHumanFactory;
import com.yrml.factory.container.male.MaleHumanFactory;
import com.yrml.factory.service.Human;

/**
 * @author created by John Tan on 2018/6/15
 */
public class NvWa {

  public static void main(String[] args) {
    HumanFactory maleHumanFactory = new MaleHumanFactory();

    HumanFactory femaleHumanFactory = new FemaleHumanFactory();

    Human maleYellowHuman = maleHumanFactory.createYellowHuman();
    Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
    maleYellowHuman.sex();
    femaleYellowHuman.sex();
  }

}
