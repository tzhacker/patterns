package com.yrml.factory.maker;

import com.yrml.factory.container.HumanFactory;
import com.yrml.factory.container.HumanFactoryLazy;
import com.yrml.factory.service.Human;
import com.yrml.factory.service.yellow.impl.BlackHuman;
import com.yrml.factory.service.yellow.impl.WhiteHuman;
import com.yrml.factory.service.yellow.impl.YellowHuman;

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

    System.out.println("\n\n --------------非延迟初始化---------------");
    Human whiteHuman2 = HumanFactory.createHuman(WhiteHuman.class);
    Human blackHuman2 = HumanFactory.createHuman(BlackHuman.class);
    Human yellowHuman2 = HumanFactory.createHuman(YellowHuman.class);
    System.out.println("whiteHuman:1[ " + whiteHuman + "  ]，2[ " + whiteHuman2 + " ]");
    System.out.println("blackHuman:1[ " + blackHuman + "  ]，2[ " + blackHuman2+ " ]");
    System.out.println("yellowHuman:1[ " + yellowHuman + "  ]，2[ " + yellowHuman2+ " ]");

    System.out.println("\n\n --------------延迟初始化---------------");
    Human whiteHumanLazy = HumanFactoryLazy.createHuman(WhiteHuman.class);
    Human whiteHumanLazy2 = HumanFactoryLazy.createHuman(WhiteHuman.class);
    System.out.println("whiteHumanLazy:1[ " + whiteHumanLazy + "  ]，2[ " + whiteHumanLazy2+ " ]");
  }
}
