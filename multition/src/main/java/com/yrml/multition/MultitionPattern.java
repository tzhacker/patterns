package com.yrml.multition;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * @author created by John Tan on 2018/6/14
 */
public class MultitionPattern {

  /**
   * 最多实例化个数
   */
  private static final int MAX_NUMBER_OF_MUTITION = 3;
  private static List<String> multitionInfoList = Lists.newArrayListWithExpectedSize(MAX_NUMBER_OF_MUTITION);
  private static List<MultitionPattern> multitionList = Lists.newArrayListWithExpectedSize(MAX_NUMBER_OF_MUTITION);
  /**
   * 当前使用的实例化对象
   */
  private static int countNumberOfMultition = 0;

  //首先把所有的对象都实例化
  static {
    for(int i = 0; i < MAX_NUMBER_OF_MUTITION; i++){
      multitionList.add(new MultitionPattern("Multition" + (i+1) + "号"));
    }
  }

  private MultitionPattern() {
  }

  private MultitionPattern(String info) {
    multitionInfoList.add(info);
  }

  /**
   * 随机的获取一个实例化对象
   * @return 实例化对象
   */
  public static MultitionPattern getInstance(){
    Random random = new Random();
    countNumberOfMultition = random.nextInt(MAX_NUMBER_OF_MUTITION);
    return multitionList.get(countNumberOfMultition);
  }

  /**
   * 通过对象标识获取指定的实例化对象
   * @param multition 对象标识
   * @return 实例化对象
   */
  public static MultitionPattern getInstance(int multition){
    countNumberOfMultition = multition;
    return multitionList.get(countNumberOfMultition);
  }

  /**
   * 该实例化对象相关的信息
   * @return information
   */
  public String multitionInfo(){
    return multitionInfoList.get(countNumberOfMultition);
  }

}
