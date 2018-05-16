package com.yrml.strategy.strategy.impl;

import com.yrml.strategy.strategy.IStrategy;

/**
 * @author zhaohui.tan
 */
public class Trip implements IStrategy {

    @Override
    public void execute() {
        System.out.println("世界辣么大，我想出去开开眼界...");
    }
}
