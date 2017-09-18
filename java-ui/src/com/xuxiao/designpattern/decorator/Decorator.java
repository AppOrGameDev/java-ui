package com.xuxiao.designpattern.decorator;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Decorator
 * @Description: 装饰器
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 11:14 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Decorator implements Component{
    protected Component component ;

    public Decorator() {
    }

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void simpleOperation() {
        if (component != null) {
            component.simpleOperation();
        }
    }
}
