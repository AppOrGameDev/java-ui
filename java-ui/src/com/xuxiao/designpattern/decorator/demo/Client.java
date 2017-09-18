package com.xuxiao.designpattern.decorator.demo;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Client
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 13:59 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Client {
    public static void main(String[] args) {
        Programmer programmer = new Developer();
        Decorator decorator = new Hacker(programmer);
        decorator.coding();
        decorator = new SoftwareArchitect(programmer);
        decorator.coding();
    }
}
