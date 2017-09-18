package com.xuxiao.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright: Copyright (c) 2017/9/18 Asiainfo
 * @ClassName: Employee
 * @Description: 员工类
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/18 11:46 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/18     xuxiao          v1.1.0               修改原因
 */
public class Employee {
    /**
     * 姓名
     */
    private String name;
    /**
     * 工号
     */
    private String employNum;
    /**
     * 上司
     */
    private List<Employee> superior;
    /**
     * 部下
     */
    private List<Employee> subordinate;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employNum='" + employNum + '\'' +
                ", superior=" + superior +
                ", subordinate=" + subordinate +
                '}';
    }

    public Employee(String name, String employNum) {
        this.name = name;
        this.employNum = employNum;
        this.superior = new ArrayList<Employee>();
        this.subordinate = new ArrayList<Employee>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployNum() {
        return employNum;
    }

    public void setEmployNum(String employNum) {
        this.employNum = employNum;
    }

    public List<Employee> getSuperior() {
        return superior;
    }

    public List<Employee> getSubordinate() {
        return subordinate;
    }

    public void addSubordinate(Employee subordinate){
        this.subordinate.add(subordinate);
    }

    public void removeSubordinate(Employee subordinate){
        this.subordinate.remove(subordinate);
    }

    public void addSuperior(Employee superior){
        this.superior.add(superior);
    }

    public void removeSuperior(Employee superior){
        this.superior.remove(superior);
    }
}
