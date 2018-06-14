package com.yrml.factory.maker;

import com.yrml.factory.container.HumanFactory;
import com.yrml.factory.service.Human;
import com.yrml.factory.service.impl.BlackHuman;
import com.yrml.factory.service.impl.WhiteHuman;
import com.yrml.factory.service.impl.YellowHuman;

/**
 * @author created by John Tan on 2018/6/14
 */
public class NvWa {

  public static void main(String[] args) {
    System.out.println("---------白人----------");
    Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
    whiteHuman.laugh();
    whiteHuman.cry();
    whiteHuman.talk();

    System.out.println("\n\n---------黑人----------");
    Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
    blackHuman.laugh();
    blackHuman.cry();
    blackHuman.talk();

    System.out.println("\n\n---------黄种人----------");
    Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
    yellowHuman.laugh();
    yellowHuman.cry();
    yellowHuman.talk();

    System.out.println("\n\n---------random make human----------");
    for (int i = 0; i < 3; i++) {

      Human human = HumanFactory.createHuman();
      human.laugh();
      human.cry();
      human.talk();

    }
  }
}
