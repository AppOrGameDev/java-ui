/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 *
 * @ClassName: package-info
 * @Description: 原型模式
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 19:03
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
package com.xuxiao.designpattern.prototype;
/**
 * 原型类prototype需要具备一下两点
 * 1、实现Cloneable接口
 * Cloneable接口，它的作用只有一个，就是在运行时通知虚拟机可以安全地在实现了此接口
 * 的类上使用clone方法。在java虚拟机中，只有实现了这个接口的类才可以被拷贝，否则在
 * 运行时会抛出 CloneNotSupportedException异常。
 *
 * 2、重写Object的clone方法 （浅拷贝，深拷贝）
 * Object类中有一个clone方法，作用是返回对象的一个拷贝，但是其作用域protected类型的，
 * 一般的类无法调用，因 此，Prototype类需要将clone方法的作用域修改为public类型。
 */