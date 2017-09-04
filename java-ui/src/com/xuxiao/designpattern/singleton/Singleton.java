package com.xuxiao.designpattern.singleton;

/**
 * Copyright: Copyright (c) 2017/9/4 Asiainfo
 * @ClassName: Singleton
 * @Description: 懒汉式单例模式
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/4 16:03 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/4     xuxiao          v1.1.0               修改原因
 */
public class Singleton {
    private static Singleton single = null;
    private Singleton(){
    }

    /**
     * 线程不安全，在高并发环境下会出现多个实例
     * 线程安全/不安全。线程操作的对象会不会被别的线程操作，会即线程不安全；不会即线程安全
     */
    public static Singleton getSingleton01(){
        if(single==null){
            single = new Singleton();
        }
        return single;
    }

    /**
     * 线程安全，添加synchronized ,做线程同步
     */
    public static synchronized Singleton getSingleton02(){
        if(single==null){
            single = new Singleton();
        }
        return single;
    }
}
