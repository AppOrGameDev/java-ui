package com.xuxiao.designpattern.builder;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: Client
 * @Description: 客户端 获取产品
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 10:54 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class Client {
    private static LogOut log = new LogOut();
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        director.construct();
        Product product = director.getBuilder().retrieveResult();
        log.info(product.toString());
    }
}
