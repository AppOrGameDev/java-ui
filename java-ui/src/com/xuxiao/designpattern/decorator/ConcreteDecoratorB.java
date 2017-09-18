package com.xuxiao.designpattern.decorator;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: ConcreteDecoratorB
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 11:27 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB() {
    }

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void simpleOperation() {
        // TODO: 2017/9/6 装饰器扩展的功能
        super.simpleOperation();
    }
}
