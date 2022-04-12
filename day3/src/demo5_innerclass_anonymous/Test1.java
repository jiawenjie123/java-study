package demo5_innerclass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 {
    public static void main(String[] args) {
        //创建窗口
        JFrame win=new JFrame("登录界面");
        JPanel panel=new JPanel();
        win.add(panel);
        //按钮
        JButton button1=new JButton("登录");
        //匿名内部类
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win,"点一下");
//            }
//        });

        //简化
        button1.addActionListener(e->JOptionPane.showMessageDialog(win,"点一下"));
        //展示
        panel.add(button1);

        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
