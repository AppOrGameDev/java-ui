package com.xuxiao.designpattern.builder;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: ConcreteBuilder
 * @Description: 具体的建造者
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 10:23 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class ConcreteBuilder implements Builder{
    /**
     * 具体的建造者建造相同零件的产品
     */
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("建造零件1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("建造零件2");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
