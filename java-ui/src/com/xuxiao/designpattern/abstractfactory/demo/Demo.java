package com.xuxiao.designpattern.abstractfactory.demo;

import com.xuxiao.designpattern.abstractfactory.factory.PhoneFactory;
import com.xuxiao.designpattern.abstractfactory.product.IProduct;
import com.xuxiao.designpattern.abstractfactory.product.impl.IPhone8;

/**
 * 单元测试类
 */
public class Demo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        IProduct product = PhoneFactory.genSingle(IPhone8.class.getName());
        System.out.println(product);
    }
}
