package com.xuxiao.designpattern.abstractfactory.factory.impl;

import com.xuxiao.designpattern.abstractfactory.factory.AbstractFactory;
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
public class PhoneFactory extends AbstractFactory{
    @Override
    public IProduct generator() {
        return new Phone();
    }
    @Override
    public IProduct genSingle(){
        return null;
    }
}
