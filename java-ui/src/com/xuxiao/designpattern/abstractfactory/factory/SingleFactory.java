package com.xuxiao.designpattern.abstractfactory.factory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Copyright: Copyright (c) 2017/9/1 Asiainfo
 * @ClassName: Factory
 * @Description: 单例工厂模式
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/1 16:54 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/1     xuxiao          v1.1.0               修改原因
 */
public class SingleFactory {
    public final static ConcurrentHashMap instanceCache = new ConcurrentHashMap();
    /**
     * 单例模式的工厂方法
     * @return
     */
    public static <T> T getInstance(String classImpl) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        if(instanceCache.get(classImpl)!=null){
            return (T) instanceCache.get(classImpl);
        }
        Object obj = newInstance(classImpl);
        instanceCache.put(classImpl,obj);
        return (T) obj;
    }

    private static <T> T newInstance(String classImpl) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class<?> aClass = Class.forName(classImpl);
        return (T) aClass.newInstance();
    }
}
