package com.xuxiao.designpattern.singleton;

/**
 * Copyright: Copyright (c) 2017/9/4 Asiainfo
 *
 * @ClassName: Week
 * @Description: 枚举类实现单例模式（星期）
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/4 17:29
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/4     xuxiao          v1.1.0               修改原因
 */
public enum Week {
    /**
     * 定义了一个星期的7天，Week枚举类的7个类型
     * 相当于
     * new Enum<Week>("MON",0);
     * new Enum<Week>("TUE",1);
     * new Enum<Week>("WED",2);
     * new Enum<Week>("THU",3);
     * new Enum<Week>("FRI",4);
     * new Enum<Week>("SAT",5);
     * new Enum<Week>("SUN",6);
     * 这7个枚举类型是按定义的顺序，自动赋值0,1,2。。。
     */
    MON, TUE, WED, THU, FRI, SAT, SUN;

    /**
     * int compareTo(E o)
     * 比较此枚举与指定对象的顺序。
     * Class<E> getDeclaringClass()
     * 返回与此枚举常量的枚举类型相对应的 Class 对象。
     * String name()
     * 返回此枚举常量的名称，在其枚举声明中对其进行声明。
     * int ordinal()
     * 返回枚举常量的序数（它在枚举声明中的位置，其中初始常量序数为零）。
     * String toString()
     * 返回枚举常量的名称，它包含在声明中。
     */
}
