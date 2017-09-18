package com.xuxiao.designpattern.facade;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Restaurant
 * @Description: 餐厅是个门面，为用户提供吃饭的服务
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 16:21 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Restaurant {
    //服务员（点菜） 厨师（做菜） 保洁（餐后清理）
    private Waiter waiter;
    private Chef chef;
    private CleaningWorker cleaningWorker;

    public Restaurant(Waiter waiter, Chef chef, CleaningWorker cleaningWorker) {
        this.waiter = waiter;
        this.chef = chef;
        this.cleaningWorker = cleaningWorker;
    }

    /**
     * 提供一桌饭菜
     */
    public void meal(){
        if (waiter != null) {
            waiter.order();
        }
        if (chef != null) {
            chef.cook();
        }
        if (cleaningWorker != null) {
            cleaningWorker.clean();
        }
    }
}
