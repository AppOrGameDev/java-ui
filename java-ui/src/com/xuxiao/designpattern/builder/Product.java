package com.xuxiao.designpattern.builder;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: Product
 * @Description: 产品
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 10:24 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class Product {
    /**
     * 产品的零件1
     */
    private String part1;
    /**
     * 产品的零件2
     */
    private String part2;

    public Product() {
    }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                '}';
    }
}
