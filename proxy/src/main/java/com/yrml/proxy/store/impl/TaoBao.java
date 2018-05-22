package com.yrml.proxy.store.impl;

import com.yrml.proxy.store.IStore;

/**
 * @author John Tan
 * @des
 * @date 2018/5/19
 */
public class TaoBao implements IStore {
    @Override
    public void saleBook() {
        System.out.println("【掏宝】Java书籍应有尽有...");
    }

    @Override
    public void saleFood() {
        System.out.println("【掏宝】Java造型食物应有尽有...");
    }

    @Override
    public void invocing() {
        System.out.println("【掏宝】我的发票带Java字样哟...");
    }
}
