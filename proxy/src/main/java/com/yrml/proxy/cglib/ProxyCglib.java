package com.yrml.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @des
 * @author John Tan
 * @date 2018/5/22
 */
public class ProxyCglib implements MethodInterceptor {

    private Object target;

    public ProxyCglib(Object target) {
        this.target = target;
    }

    //获取目标对象的代理对象
    public Object getProxyInstance(){
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类(代理对象)
        return enhancer.create();

    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("【代理】我们将为您送上一杯热牛奶...");
        System.out.println("【代理】首先从商店购买...");
        method.invoke(target, args);
        System.out.println("【代理】加热...");
        System.out.println("【代理】这是您的热牛奶...");
        return null;
    }
}
