package com.xuxiao.designpattern.abstractfactory.factory;

import com.xuxiao.designpattern.abstractfactory.product.IProduct;
import com.xuxiao.designpattern.abstractfactory.product.impl.Phone;

/**
 * Copyright: Copyright (c) 2017/8/29 Asiainfo
 * @ClassName: PhoneFactory
 * @Description: 手机厂商
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/8/29 16:15 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/8/29     xuxiao          v1.1.0               修改原因
 */
public class PhoneFactory {
    /**
     * 普通工厂方法
     */
    public static IProduct generator(String classImpl) {
        if(Phone.class.getName().equals(classImpl)){
            return new Phone();
        }
        // TODO: 2017/9/1  扩展产品实例
        return null;
    }

    public static IProduct genSingle(String classImpl) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        IProduct obj = SingleFactory.getInstance(classImpl);
        return obj;
    }
}
