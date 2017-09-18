package com.xuxiao.designpattern.decorator;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Client
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 11:28 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Client {
    public static void main(String[] args) {
        Decorator decoratorA = new ConcreteDecoratorA(new ConcreteComponent());
        decoratorA.simpleOperation();
        Decorator decoratorB = new ConcreteDecoratorB(new ConcreteComponent());
        decoratorB.simpleOperation();
    }
}
