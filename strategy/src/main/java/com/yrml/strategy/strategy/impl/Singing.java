package com.yrml.strategy.strategy.impl;

import com.yrml.strategy.strategy.IStrategy;

/**
 * @author zhaohui.tan
 */
public class Singing implements IStrategy {

    @Override
    public void execute() {
        System.out.println("白月光，心里某个地方...");
    }
}
