package com.yrml.proxy.filter;

import net.sf.cglib.proxy.FixedValue;

/**
 * @author zhaohui.tan
 */
public class TargetResultFixed implements FixedValue {

    /**
     * 实现FixedValue接口，同时锁定回调值为999(整型，CallbackFilter中定义的
     * 使用FixedValue型回调的方法为getConcreteMethodFixedValue,该方法返回值
     * 为整型)
     * @return
     * @throws Exception
     */
    @Override
    public Object loadObject() throws Exception {
        System.out.println("锁定结果");
        Object obj = 999;
        return obj;
    }
}
