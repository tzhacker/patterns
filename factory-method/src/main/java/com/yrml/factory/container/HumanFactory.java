package com.yrml.factory.container;

import com.yrml.factory.service.Human;
import com.yrml.factory.utils.ClassUtils;

import java.util.List;
import java.util.Random;

/**
 * @author created by John Tan on 2018/6/14
 */
public class HumanFactory {

  public static Human createHuman(Class c){
    Human human = null;
    try {
      human = (Human) Class.forName(c.getName()).newInstance();
    } catch (InstantiationException e) {
      System.out.println("必须指定人种的颜色");
    } catch (IllegalAccessException e) {
      System.out.println("人种定义错误");
    } catch (ClassNotFoundException e) {
      System.out.println("指定的人种找不到");
    }
    return human;
  }

  /**
   * 随机的造人类
   * @return Human的实现类实例化对象
   */
  public static Human createHuman(){
    Human human = null;
    List<Class> concreateHumanList = ClassUtils.getAllClassByInterface(Human.class);
    Random random = new Random();
    int rand = random.nextInt(concreateHumanList.size());
    human = createHuman(concreateHumanList.get(rand));
    return human;
  }
}
