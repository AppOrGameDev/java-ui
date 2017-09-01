package com.xuxiao.designpattern.abstractfactory.product;

/**
 * Copyright: Copyright (c) 2017/8/29 Asiainfo
 * @ClassName: AbstractProduct
 * @Description: 抽象产品
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/8/29 16:09 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/8/29     xuxiao          v1.1.0               修改原因
 */
public abstract class AbstractProduct implements IProduct{
    private String name;
    private Long no;

    @Override
    public String toString() {
        return "AbstractProduct{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }
}
