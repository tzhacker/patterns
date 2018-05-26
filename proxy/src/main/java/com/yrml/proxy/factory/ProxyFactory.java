package com.yrml.proxy.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @des
 * @author John Tan
 * @date 2018/5/22
 */
public class ProxyFactory {

    /**
     * 维护目标对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象生成代理对象
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                //获取目标对象的类加载器
                target.getClass().getClassLoader(),
                //获取目标对象的接口信息
                target.getClass().getInterfaces(),
                /*
                 * InvocationHandler is the interface implemented by the
                 * invocation handler of a proxy instance.
                 * Each proxy instance has an associated invocation handler.
                 * When a method is invoked on a proxy instance,
                 * the method invocation is encoded and dispatched to the
                 * invoke method of its invocation handler.
                 */
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //这里可以通过获取方法的name，实现对不同方法不同的增强处理
                        System.out.println("买东西前确认银行卡余额...");
                        method.invoke(target, args);
                        System.out.println("确认收货");
                        return null;
                    }
                }
        );
    }
}
