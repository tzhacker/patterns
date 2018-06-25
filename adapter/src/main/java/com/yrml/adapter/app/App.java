package com.yrml.adapter.app;

import com.yrml.adapter.info.IUserInfo;
import com.yrml.adapter.info.UserInfo;
import com.yrml.adapter.outer.OuterUserInfo;

/**
 * @author created by John Tan on 2018/6/25
 */
public class App {

  public static void main(String[] args) {
//    IUserInfo youngGirl = new UserInfo();

    IUserInfo youngGirl = new OuterUserInfo();
    youngGirl.getHomeAddress();


  }
}
