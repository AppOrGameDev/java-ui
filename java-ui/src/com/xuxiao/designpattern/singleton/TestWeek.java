package com.xuxiao.designpattern.singleton;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/4 Asiainfo
 * @ClassName: TestWeek
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/4 17:35 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/4     xuxiao          v1.1.0               修改原因
 */
public class TestWeek {
    private static LogOut log = new LogOut();

    public static void main(String[] args) {
        TestWeek test = new TestWeek();
        test.test01();
        test.test02();
    }
    
    public static void test01() {
        for (Week item : Week.values()) {
            log.info("name()::"+item.name());
            log.info("ordinal()::"+item.ordinal()+"");
            log.info("getDeclaringClass()::"+item.getDeclaringClass().getName());
            log.info("toString()::"+item.toString());
            log.info("getClass()::"+item.getClass().getName());
        }
        //枚举类可以适用switch
        for (Week item : Week.values()) {
            switch (item){
                case MON : log.info("星期一");break;
                case TUE : log.info("星期二");break;
                case WED : log.info("星期三");break;
                case THU : log.info("星期四");break;
                case FRI : log.info("星期五");break;
                case SAT : log.info("星期六");break;
                case SUN : log.info("星期天");break;
                default  : log.info("错误");break;
            }
        }
    }

    public static void test02() {
        for (WeekExt item : WeekExt.values()) {
            log.info(item.toString());
        }
    }
}
