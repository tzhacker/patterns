package com.yrml.singleton.demo;

/**
 * created by John Tan on 2018-05-27
 */
public class Master {

    private static Master master = null;

    /**
     * 禁止产生外部调用产生第二个实例
     */
    private Master() {
    }

    /**
     * 如果还没有实例化对象，那么实例化一个
     * @return Emperor对象
     */
    public static Master getInstance(){
        if(master == null){
            master = new Master();
        }
        return master;
    }

    public static String masterInfo(){
        String name = "幽若梦蓝";
        name += "的世界";
        return name;
    }
}
