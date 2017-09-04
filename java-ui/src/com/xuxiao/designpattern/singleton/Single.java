package com.xuxiao.designpattern.singleton;

/**
 * Copyright: Copyright (c) 2017/9/4 Asiainfo
 * @ClassName: Single
 * @Description: 双重检查锁定
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/4 16:39 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/4     xuxiao          v1.1.0               修改原因
 */
public class Single {
    private volatile static Single single ;
    private Single(){}

    public Single getSingle(){
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(single==null){
            //同步块，线程安全的创建实例
            synchronized (Single.class){
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(single==null){
                    single = new Single();
                }
            }
        }
        return single;
    }

    /**
     *    静态内部类（天生支持延迟加载）
     *    类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     *    没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    public static class SingleHolder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Single single = new Single();
    }

    public static Single genSingle(){
        return SingleHolder.single;
    }
}
