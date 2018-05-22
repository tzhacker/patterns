package com.yrml.proxy.store;

/**
 * @des 商店性质
 * @author John Tan
 * @date 2018/5/19
 */
public interface IStore {

    /**
     * 卖书
     */
    void saleBook();

    /**
     * 卖吃的
     */
    void saleFood();

    /**
     * 开发票
     */
    void invocing();
}
