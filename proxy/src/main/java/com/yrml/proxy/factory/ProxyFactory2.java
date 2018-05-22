package com.yrml.proxy.factory;

import com.yrml.proxy.store.IStore;
import com.yrml.proxy.store.impl.TaoBao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author John Tan
 * @des
 * @date 2018/5/22
 */
public class ProxyFactory2 implements InvocationHandler {

    IStore target = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(target == null){
            target = new TaoBao();
        }
        System.out.println("我想买Java书籍...");
        target.saleBook();
        System.out.println("给我《Effective of Java》...");
        return null;
    }

    public static IStore createProxy() {
        IStore proxy = (IStore) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {IStore.class}, new ProxyFactory2());
        return proxy;
    }
}
