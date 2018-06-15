package com.yrml.factory.container;

import com.yrml.factory.service.Human;

/**
 * @author created by John Tan on 2018/6/15
 */
public interface HumanFactory {

  Human createYellowHuman();

  Human createWhiteHuman();

  Human createBlackHuman();
}
