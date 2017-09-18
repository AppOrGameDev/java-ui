/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 *
 * @ClassName: package-info
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 14:12
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
package com.xuxiao.designpattern.proxy;
/**
 * 抽象主题角色：声明了目标对象和代理对象的共同接口，这样一来在任何可以使用目标对象的地方都可以使用代理对象。
 * 真实主题角色：定义了代理对象所代表的目标对象。
 * 代理主题角色：代理对象内部含有目标对象的引用，从而可以在任何时候操作目标对象；代理对象提供一个与目标对象
 * 相同的接口，以便可以在任何时候替代 目标对象。代理对象通常在客户端调用传递给目标对象之前或之后，执行某个操作，
 * 而不是单纯地将调用传递给目标对象。它可以增加一些真实主题里面没有的功能。
 *
 * 非常重要的知识点：动态代理 Dynamic Proxy
 *
 */