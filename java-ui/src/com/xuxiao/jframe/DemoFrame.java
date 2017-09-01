package com.xuxiao.jframe;


import javax.swing.*;
import java.awt.*;

/**
 * Copyright: Copyright (c) 2017/7/28 Asiainfo
 * @ClassName: MainFrame
 * @Description: 主窗口
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/7/28 13:04 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/7/28     xuxiao          v1.1.0               修改原因
 */
public class DemoFrame extends JFrame {
    //定义组件
    JPanel jp1,jp2,jp3;//面板
    JLabel jlb1,jlb2;//标签
    JButton jb1,jb2;//按钮
    JTextField jtf;//文本
    JPasswordField jpf;//密码

    public static void main(String[] args) {
        DemoFrame win=new DemoFrame();
    }

    //构造函数
    public DemoFrame(){
        //创建面板
        jp1=new JPanel();
        jp2=new JPanel();
        jp3=new JPanel();
        //创建标签
        jlb1=new JLabel("user-name");
        jlb2=new JLabel("password");
        //创建按钮
        jb1=new JButton("login");
        jb2=new JButton("reset");
        //创建文本框
        jtf=new JTextField(10);
        //创建密码框
        jpf=new JPasswordField(10);

        //设置布局管理
        this.setLayout(new GridLayout(3, 1));//网格式布局

        //加入各个组件
        jp1.add(jlb1);
        jp1.add(jtf);

        jp2.add(jlb2);
        jp2.add(jpf);

        jp3.add(jb1);
        jp3.add(jb2);

        //加入到JFrame
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        //设置窗体
        this.setTitle("user-login");//窗体标签
        this.setSize(300, 150);//窗体大小
        this.setLocationRelativeTo(null);//在屏幕中间显示(居中显示)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出关闭JFrame
        this.setVisible(true);//显示窗体

        //锁定窗体
        this.setResizable(false);
    }
}
