package com.xuxiao.designpattern.prototype;

import java.sql.Timestamp;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: DeepClonePersonal
 * @Description: 深拷贝
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 20:01 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class DeepClonePerson implements Cloneable{
    protected String id;
    protected String name;
    protected int age;
    protected Timestamp brithday;
    protected DeepClonePerson father;
    protected DeepClonePerson mother;

    @Override
    protected DeepClonePerson clone() throws CloneNotSupportedException {
        DeepClonePerson deepClonePersonal = new DeepClonePerson();
        deepClonePersonal.setId(this.id);
        deepClonePersonal.setName(this.name);
        deepClonePersonal.setAge(this.age);
        deepClonePersonal.setBrithday(new Timestamp(this.getBrithday().getTime()));
        DeepClonePerson father = new DeepClonePerson();
        if(this.father!=null){
            father = this.father.clone();
            deepClonePersonal.setFather(father);
        }
        DeepClonePerson mother = new DeepClonePerson();
        if (this.mother != null) {
            mother = this.mother.clone();
            deepClonePersonal.setMother(mother);
        }
        return deepClonePersonal;
    }

    public DeepClonePerson() {
    }

    public DeepClonePerson(String id, String name, int age, Timestamp brithday, DeepClonePerson father, DeepClonePerson mother) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.brithday = brithday;
        this.father = father;
        this.mother = mother;
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

    public DeepClonePerson getFather() {
        return father;
    }

    public void setFather(DeepClonePerson father) {
        this.father = father;
    }

    public DeepClonePerson getMother() {
        return mother;
    }

    public void setMother(DeepClonePerson mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "DeepClonePersonal{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", brithday=" + brithday +
                ", father=" + father +
                ", mother=" + mother +
                '}';
    }
}
