package com.yrml.multition;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * @author created by John Tan on 2018/6/14
 */
public class MultitionPattern {

  private static final int MAX_NUMBER_OF_MUTITION = 3;
  private static List<String> multitionInfoList = Lists.newArrayListWithExpectedSize(MAX_NUMBER_OF_MUTITION);
  private static List<MultitionPattern> multitionList = Lists.newArrayListWithExpectedSize(MAX_NUMBER_OF_MUTITION);
  private static int countNumberOfMultition = 0;

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

  public static MultitionPattern getInstance(){
    Random random = new Random();
    countNumberOfMultition = random.nextInt(MAX_NUMBER_OF_MUTITION);
    return multitionList.get(countNumberOfMultition);
  }

  public static MultitionPattern getInstance(int multition){
    countNumberOfMultition = multition;
    return multitionList.get(countNumberOfMultition);
  }

  public void multitionInfo(){
    System.out.println(multitionInfoList.get(countNumberOfMultition));
  }

}
