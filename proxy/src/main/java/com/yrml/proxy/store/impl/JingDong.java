package com.yrml.proxy.store.impl;

import com.yrml.proxy.store.IStore;

/**
 * @author John Tan
 * @des
 * @date 2018/5/19
 */
public class JingDong implements IStore {

    @Override
    public void saleBook() {
        System.out.println("【竞东】C++书籍走过路过不要错过...");
    }

    @Override
    public void saleFood() {
        System.out.println("【竞东】C++食物走过路过不要错过...");
    }

    @Override
    public void invocing() {
        System.out.println("【竞东】我们的发票自带C++字样哟...");
    }
}
