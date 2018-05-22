package com.yrml.proxy.consumer;

import com.yrml.proxy.proxy.ProxyStore;
import com.yrml.proxy.store.impl.JingDong;

/**
 * @author John Tan
 * @des
 * @date 2018/5/19
 */
public class Someone {


    public static void main(String[] args) {

        ProxyStore store;
        store = new ProxyStore();
        System.out.println("------买代理者默认代理的------");
        store.saleBook();
        store.saleFood();
        store.invocing();
        System.out.println("\n");

        store = new ProxyStore(new JingDong());
        System.out.println("------指定代理者某渠道的货物------");
        store.saleBook();
        store.saleFood();
        store.invocing();
    }

}
