package com.yrml.adapter.outer;

import com.yrml.adapter.info.IUserInfo;

import java.util.Map;

/**
 * @author created by John Tan on 2018/6/25
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

  private Map<String, String> baseInfo = getUserBaseInfo();

  private Map<String, String> homeInfo = getUserHomeInfo();

  private Map<String, String> officeInfo = getUserOfficeInfo();

  @Override
  public String getUserName() {
    String userName = this.baseInfo.get("userName");
    System.out.println(userName);
    return userName;
  }

  @Override
  public String getHomeAddress() {
    String homeAddress = this.homeInfo.get("homeAddress");
    System.out.println(homeAddress);
    return homeAddress;
  }

  @Override
  public String getMobileNumber() {
    String mobileNumber = this.baseInfo.get("mobileNumber");
    System.out.println(mobileNumber);
    return mobileNumber;
  }

  @Override
  public String getOfficeTelNumber() {
    String officeTelNumber = this.officeInfo.get("officeTelNumber");
    System.out.println(officeTelNumber);
    return officeTelNumber;
  }

  @Override
  public String getJobPosition() {
    String jobPosition = this.officeInfo.get("jobPosition");
    System.out.println(jobPosition);
    return jobPosition;
  }

  @Override
  public String getHomeTelNumber() {
    String homeTelNumber = this.homeInfo.get("homeTelNumber");
    System.out.println(homeTelNumber);
    return homeTelNumber;
  }
}
