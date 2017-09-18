package com.xuxiao.designpattern.composite;

/**
 * Copyright: Copyright (c) 2017/9/18 Asiainfo
 * @ClassName: Client
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/18 14:45 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/18     xuxiao          v1.1.0               修改原因
 */
public class Client {
    public static void main(String[] args) {
        Employee boss = new Employee("老板","001");
        Employee saler = new Employee("销售","002");
        Employee manager = new Employee("经理","003");
        boss.addSubordinate(saler);
        boss.addSubordinate(manager);
        System.out.println(boss);
    }
}
