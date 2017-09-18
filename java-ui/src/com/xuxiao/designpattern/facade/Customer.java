package com.xuxiao.designpattern.facade;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Customer
 * @Description: 食客
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 16:35 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Customer {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(new Waiter(),new Chef(),new CleaningWorker());
        restaurant.meal();
    }
}
