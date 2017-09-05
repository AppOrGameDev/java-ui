package com.xuxiao.designpattern.prototype;

import java.sql.Timestamp;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: ClonePerson
 * @Description: 克隆人原型对象
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 19:19 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class ClonePerson implements Cloneable{
    protected String id;
    protected String name;
    protected int age;
    protected Timestamp brithday;
    protected ClonePerson father;
    protected ClonePerson mother;
    /**
     * 浅拷贝（拷贝属性值的引用）基本数据类型、String类型只传递数值，而对其他对象则拷贝引用，只想相同的地址空间
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected ClonePerson clone() throws CloneNotSupportedException {
        return (ClonePerson) super.clone();
    }

    public ClonePerson(String id, String name, int age, Timestamp brithday, ClonePerson father, ClonePerson mother) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.brithday = brithday;
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "ClonePerson{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", brithday=" + brithday +
                ", father=" + father +
                ", mother=" + mother +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Timestamp getBrithday() {
        return brithday;
    }

    public void setBrithday(Timestamp brithday) {
        this.brithday = brithday;
    }

    public ClonePerson getFather() {
        return father;
    }

    public void setFather(ClonePerson father) {
        this.father = father;
    }

    public ClonePerson getMother() {
        return mother;
    }

    public void setMother(ClonePerson mother) {
        this.mother = mother;
    }
}
