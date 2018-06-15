package com.yrml.factory.container;

import com.yrml.factory.enums.HumanEnum;
import com.yrml.factory.service.Human;

/**
 * @author created by John Tan on 2018/6/15
 */
public abstract class AbstractHumanFactory implements HumanFactory {

  protected Human createHuman(HumanEnum humanEnum){
    Human human = null;
    if(!"".equals(humanEnum.getValue())){
      try {
        human = (Human) Class.forName(humanEnum.getValue()).newInstance();
      } catch (Exception e) {
        System.out.println("实例化对象异常...");
      }
    }
    return human;
  }
}
