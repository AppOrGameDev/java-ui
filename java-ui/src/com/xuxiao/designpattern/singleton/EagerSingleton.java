package com.xuxiao.designpattern.singleton;

/**
 * Copyright: Copyright (c) 2017/9/4 Asiainfo
 * @ClassName: EagerSingleton
 * @Description: 饿汉式单例模式（类加载时就创建实例）
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/4 17:03 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/4     xuxiao          v1.1.0               修改原因
 */
public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getEagerSingleton(){
        return eagerSingleton;
    }
}
