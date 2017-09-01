package com.xuxiao.jframe;

import sun.rmi.runtime.Log;

import javax.swing.*;
import java.util.concurrent.SynchronousQueue;
import java.util.logging.Logger;

/**
 * Copyright: Copyright (c) 2017/7/28 Asiainfo
 * @ClassName: MainFrame
 * @Description: 主窗口
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/7/28 13:17 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/7/28     xuxiao          v1.1.0               修改原因
 */
public class MainFrame extends JFrame{

    static {
        //config.xml配置
        String projPath = System.getProperty("user.dir");
        //config.properties配置
    }

    public void display(){
        //设置窗体
        setTitle("user-login");//窗体标签
        setSize(300, 150);//窗体大小
        setLocationRelativeTo(null);//在屏幕中间显示(居中显示)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出关闭JFrame
        setVisible(true);//显示窗体

        //锁定窗体大小（不能调整窗口大小）
        setResizable(false);
    }


    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.display();
    }
}
