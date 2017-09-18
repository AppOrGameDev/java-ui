package com.xuxiao.designpattern.decorator;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: ConcreteDecoratorA
 * @Description: 装饰器A
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 11:23 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA() {
    }

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void simpleOperation() {
        // TODO: 2017/9/6 装饰器扩展的功能
        super.simpleOperation();
    }


}
