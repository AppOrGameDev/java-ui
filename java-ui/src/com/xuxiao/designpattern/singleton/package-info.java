/**
 * Copyright: Copyright (c) 2017/9/4 Asiainfo
 *
 * @ClassName: package-info
 * @Description: 单例模式
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/4 16:02
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/4     xuxiao          v1.1.0               修改原因
 */
package com.xuxiao.designpattern.singleton;

/**
 * 一、特点：
 * 1、单例类只能有一个实例。
 * 2、单例类必须自己创建自己的唯一实例。
 * 3、单例类必须给所有其他对象提供这一实例。
 * 单例模式确保某个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
 */

/**
 * 懒汉式单例模式（线程不安全）com.xuxiao.designpattern.singleton.Singleton#getSingleton01()
 * synchronized 同步获取实例的方法，保证线程安全，在高并发下不会被创建多个实例 com.xuxiao.designpattern.singleton.Singleton#getSingleton02()
 * 双重检查锁定 com.xuxiao.designpattern.singleton.Single#getSingle()
 * 静态内部类 jvm装载类时是线程安全的 com.xuxiao.designpattern.singleton.Single.SingleHolder
 * 饿汉式单例模式 在jvm装载类时就创建实例，因此不会延迟加载，（饿汉立马满足，立马创建实例） com.xuxiao.designpattern.singleton.EagerSingleton
 * 枚举类实现单例模式（跟饿汉式单例模式原理是一样的，只是换成enum枚举类这个形式）
 */

/**
 * 如果你的代码所在的进程中有多个线程在同时运行，
 * 而这些线程可能会同时运行这段代码。如果每次运
 * 行结果和单线程运行的结果是一样的，而且其他的
 * 变量的值也和预期的是一样的，就是线程安全的。
 */