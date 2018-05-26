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

    /**
     * 获取目标对象的代理对象
     */
    public Object getProxyInstance(){
        //字节码增强器工具类
        Enhancer enhancer = new Enhancer();
        //设置父类，继承代理类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类(代理对象)
        return enhancer.create();

    }

    /**
     * 回调方法
     * @param obj 代理对象
     * @param method 委托方法
     * @param args 方法参数
     * @param proxy 代理方法的MethodProxy对象
     * @return 方法执行结果
     * @throws Throwable 异常
     */
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
