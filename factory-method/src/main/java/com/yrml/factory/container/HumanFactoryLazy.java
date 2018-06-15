package com.yrml.factory.container;

import com.google.common.collect.Maps;
import com.yrml.factory.service.Human;

import java.util.HashMap;

/**
 * 利用工厂模式实现延迟初始化的应用
 * 延迟初始化：一个对象初始化完后不释放，等到再次使用的时候就不用再次初始化了，直接从内存中拿
 * @author created by John Tan on 2018/6/15
 */
public class HumanFactoryLazy {

  private static HashMap<String, Human> humans = Maps.newHashMap();

  public static Human createHuman(Class clzz){
    Human human = null;
    try {
      if(humans.containsKey(clzz.getSimpleName())){
        human = humans.get(clzz.getSimpleName());
      }else{
        human = (Human) Class.forName(clzz.getName()).newInstance();
        humans.put(clzz.getSimpleName(), human);
      }
    } catch (InstantiationException e) {
      System.out.println("必须指定人种的颜色");
    } catch (IllegalAccessException e) {
      System.out.println("人种定义错误");
    } catch (ClassNotFoundException e) {
      System.out.println("指定的人种找不到");
    }
    return human;
  }
}
