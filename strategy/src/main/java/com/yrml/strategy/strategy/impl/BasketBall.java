package com.yrml.strategy.strategy.impl;

import com.yrml.strategy.strategy.IStrategy;

/**
 * @author zhaohui.tan
 */
public class BasketBall implements IStrategy {

    @Override
    public void execute() {
        System.out.println("转身一个完美三分球...");
    }
}
