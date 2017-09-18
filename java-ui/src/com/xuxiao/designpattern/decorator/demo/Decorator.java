package com.xuxiao.designpattern.decorator.demo;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Decorator
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 13:54 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Decorator implements Programmer{
    private Programmer programmer;

    public Decorator(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void coding() {
        if (programmer != null) {
            programmer.coding();
        }
    }
}
