package com.yrml.proxy.filter;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.CallbackFilter;

/**
 * 自定义方法过滤器，实现CallbackFilter类
 * @author zhaohui.tan
 */
public class TargetMethodCallbackFilter implements CallbackFilter {

    /**
     * 过滤方法
     * @param method 方法的方法对象
     * @return Callback数组中的索引位置
     */
    @Override
    public int accept(final Method method) {
        String name = method.getName();
        if("method1".equals(name)){
            System.out.println("filter method1 == 0");
            return 0;
        }
        if("method21".equals(name)){
            System.out.println("filter method2 == 1");
            return 1;
        }
        if("method3".equals(name)){
            System.out.println("filter method3 == 2");
            return 2;
        }
        return 0;

    }
}
