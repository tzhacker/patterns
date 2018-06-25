package com.yrml.adapter.outer;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * @author created by John Tan on 2018/6/25
 */
public class OuterUser implements IOuterUser {

  @Override
  public Map getUserBaseInfo() {
    Map<String, String> baseInfoMap = Maps.newHashMap();
    baseInfoMap.put("userName", "userName");
    baseInfoMap.put("mobileNumber", "mobileNumber");
    return baseInfoMap;
  }

  @Override
  public Map getUserOfficeInfo() {
    Map<String, String> officeInfo = Maps.newHashMap();
    officeInfo.put("jobPosition", "jobPosition");
    officeInfo.put("officeTelNumber", "officeTelNumber");
    return officeInfo;
  }

  @Override
  public Map getUserHomeInfo() {
    Map<String, String> homeInfo = Maps.newHashMap();
    homeInfo.put("homeTelNumber", "jobPosition");
    homeInfo.put("homeAddress", "homeAddress");
    return homeInfo;
  }
}
