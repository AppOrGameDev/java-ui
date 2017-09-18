/**
 * Copyright: Copyright (c) 2017/9/18 Asiainfo
 *
 * @ClassName: package-info
 * @Description: 组合模式
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/18 11:35
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/18     xuxiao          v1.1.0               修改原因
 */
package com.xuxiao.designpattern.composite;
/**
 * 组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。
 * 组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式
 * ，它创建了对象组的树形结构。
 *
 * 如何解决：树枝和叶子实现统一接口，树枝内部组合该接口。
 * 关键代码：树枝内部组合该接口，并且含有内部属性 List，里面放 Component。
 * 应用实例： 1、算术表达式包括操作数、操作符和另一个操作数，其中，另一个操作符也可以是操作树、
 * 操作符和另一个操作数。 2、在 JAVA AWT 和 SWING 中，对于 Button 和 Checkbox 是树叶，Container
 * 是树枝。
 * 优点： 1、高层模块调用简单。 2、节点自由增加。
 * 缺点：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
 * 使用场景：部分、整体场景，如树形菜单，文件、文件夹的管理。
 *
 * 样例：公司组织结构
 */