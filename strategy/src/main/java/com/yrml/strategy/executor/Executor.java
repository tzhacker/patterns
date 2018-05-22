package com.yrml.strategy.executor;

import com.yrml.strategy.context.Context;
import com.yrml.strategy.strategy.impl.BasketBall;
import com.yrml.strategy.strategy.impl.Singing;
import com.yrml.strategy.strategy.impl.Trip;

/**
 * 策略执行者
 * 策略模式的好处：体现了高内聚低耦合的特性
 * @author zhaohui.tan
 * @date 2018-05-16
 */
public class Executor {

    public static void main(String[] args) {
        Context context;
        System.out.println(">>>>>>>>>>>心血来潮想唱歌<<<<<<<<<<<");
        context = new Context(new Singing());
        context.operation();
        System.out.println("\n");

        System.out.println("-----------被詹姆斯刺激了-----------");
        context = new Context(new BasketBall());
        context.operation();
        System.out.println("\n");

        System.out.println("===============裸辞=================");
        context = new Context(new Trip());
        context.operation();
        System.out.println("\n");
    }

}
