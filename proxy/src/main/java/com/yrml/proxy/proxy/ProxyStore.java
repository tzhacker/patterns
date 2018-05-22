package com.yrml.proxy.proxy;

import com.yrml.proxy.store.IStore;
import com.yrml.proxy.store.impl.TaoBao;

/**
 * @author John Tan
 * @des
 * @date 2018/5/19
 */
public class ProxyStore implements IStore {

    private IStore store;

    /**
     * 默认代理出售掏宝的东西
     */
    public ProxyStore() {
        this.store = new TaoBao();
    }

    /**
     * 扩展出售指定渠道的货物
     * @param store 渠道
     */
    public ProxyStore(IStore store) {
        this.store = store;
    }

    @Override
    public void saleBook() {
        store.saleBook();
    }

    @Override
    public void saleFood() {
        store.saleFood();
    }

    @Override
    public void invocing() {
        store.invocing();
    }
}
