/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 *
 * @ClassName: package-info
 * @Description: 装饰模式
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 11:08
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
package com.xuxiao.designpattern.decorator;
/**
 * 1.装饰模式(Decorator)的定义：又名包装(Wrapper)模式，装饰模式以对客户端透明的方式扩展对象的功能，是继承关系的一个替代方案。
 * 2.装饰模式以对客户端透明的方式动态的给一个对象附加上更多的责任。换言之客户端并不会觉的对象在装饰前和装饰后有什么区别。
 * 3.装饰模式可以在不创造更多的子类的模式下，将对象的功能加以扩展。
 *
 * 抽象构件(Component)角色：给出一个抽象接口，以规范准备接收附加责任的对象。
 * 具体构件(ConcreteComponent)角色：定义一个将要接收附加责任的类。
 * 装饰(Decorator)角色：持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口。
 * 具体装饰(ConcreteDecorator)角色：负责给构件对象“贴上”附加的责任。
 */