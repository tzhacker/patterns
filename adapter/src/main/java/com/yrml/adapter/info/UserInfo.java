package com.yrml.adapter.info;

/**
 * @author created by John Tan on 2018/6/25
 */
public class UserInfo implements IUserInfo {

  @Override
  public String getUserName() {
    System.out.println("the employeer's username.");
    return null;
  }

  @Override
  public String getHomeAddress() {
    System.out.println("the employeer's address.");
    return null;
  }

  @Override
  public String getMobileNumber() {
    System.out.println("the employeer's mobile-number.");
    return null;
  }

  @Override
  public String getOfficeTelNumber() {
    System.out.println("the employeer's office-tel-number.");
    return null;
  }

  @Override
  public String getJobPosition() {
    System.out.println("the employeer's job-position.");
    return null;
  }

  @Override
  public String getHomeTelNumber() {
    System.out.println("the employeer's home-tel-number.");
    return null;
  }
}
