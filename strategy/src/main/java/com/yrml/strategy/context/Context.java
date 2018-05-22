package com.yrml.strategy.context;

import com.yrml.strategy.strategy.IStrategy;

/**
 * 存放策略的容器
 * @author zhaohui.tan
 * @date 2018-05-16
 */
public class Context {

    private IStrategy strategy;

    public Context(final IStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行策略
     */
    public void operation(){
        this.strategy.execute();
    }

}
