package com.xuxiao.designpattern.prototype;

import com.xuxiao.designpattern.LogOut;

import java.sql.Timestamp;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: Client
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 19:24 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class Client {
    private static transient LogOut log = new LogOut();

    public static void main(String[] args) throws CloneNotSupportedException {
        log.info("******************浅拷贝******************");
        testSimpleClone();
        log.info("******************深拷贝******************");
        testDeepClone();
    }

    public static void testSimpleClone() throws CloneNotSupportedException {
        ClonePerson prototypePerson = new ClonePerson("001","小明",10, new Timestamp(System.currentTimeMillis()), new ClonePerson("002","爸爸",36, new Timestamp(System.currentTimeMillis()), null, null), new ClonePerson("002","妈妈",35, new Timestamp(System.currentTimeMillis()), null, null));
        ClonePerson clonePerson = prototypePerson.clone();
        log.info("原型::"+prototypePerson.toString());
        log.info("克隆::"+clonePerson.toString());
        log.info("prototypePerson == clonePerson 结果::"+(prototypePerson==clonePerson));
        log.info("prototypePerson.getId() == clonePerson.getId() 结果::"+(prototypePerson.getId()==clonePerson.getId()));
        clonePerson.setBrithday(new Timestamp(System.currentTimeMillis()));
        clonePerson.getFather().setName("新爸爸");
        clonePerson.getMother().setName("新妈妈");
        log.info("修改克隆人的生日后");
        log.info("原型::"+prototypePerson.toString());
        log.info("克隆::"+clonePerson.toString());
        log.info("prototypePerson == clonePerson 结果::"+(prototypePerson==clonePerson));
        log.info("prototypePerson.getId() == clonePerson.getId() 结果::"+(prototypePerson.getId()==clonePerson.getId()));
        /**
         * 修改生日，父母的姓名后可以看到
         * 克隆人的生日改变了，但是原型人的生日没有变；
         * 克隆人的ID和原型人的ID的内存地址空间相等；
         * 克隆人和原型人的父母的名字保持一致
         * 证明是浅拷贝。克隆人的属性是原型人属性的引用。但是对象是新的对象
         */
    }

    public static void testDeepClone() throws CloneNotSupportedException {
        DeepClonePerson prototypePerson = new DeepClonePerson("001","小明",10, new Timestamp(System.currentTimeMillis()), new DeepClonePerson("002","爸爸",36, new Timestamp(System.currentTimeMillis()), null, null), new DeepClonePerson("002","妈妈",35, new Timestamp(System.currentTimeMillis()), null, null));
        DeepClonePerson clonePerson = prototypePerson.clone();
        log.info("原型::"+prototypePerson.toString());
        log.info("克隆::"+clonePerson.toString());
        log.info("prototypePerson == clonePerson 结果::"+(prototypePerson==clonePerson));
        log.info("prototypePerson.getId() == clonePerson.getId() 结果::"+(prototypePerson.getId()==clonePerson.getId()));
        clonePerson.setBrithday(new Timestamp(System.currentTimeMillis()));
        clonePerson.getFather().setName("新爸爸");
        clonePerson.getMother().setName("新妈妈");
        log.info("修改克隆人的生日后");
        log.info("原型::"+prototypePerson.toString());
        log.info("克隆::"+clonePerson.toString());
        log.info("prototypePerson == clonePerson 结果::"+(prototypePerson==clonePerson));
        log.info("prototypePerson.getId() == clonePerson.getId() 结果::"+(prototypePerson.getId()==clonePerson.getId()));
    }
}
