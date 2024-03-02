package interFace;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {

    public void initUI(){
        JFrame jf = new JFrame ();
        jf.setTitle ("yoloMonitor Login");//窗体标题
        jf.setSize (500, 500);//窗体大小
        // 设置关闭时 直接退出进程
        jf.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        // 布局管理 流式布局
        FlowLayout fl = new FlowLayout ();
        jf.setLayout (fl);

        // 创建组件对象 按钮 输入框 标签
        JButton btn = new JButton ("登录");
        JLabel namejla = new JLabel ("账号：");
        JLabel pwdjla = new JLabel ("密码：");
        JTextField nameField = new JTextField();
        JPasswordField pwdField = new JPasswordField();

        // 图片
        ImageIcon img = new ImageIcon("C:\\\\Users\\\\LENOVO\\\\Desktop\\\\蓝杰\\\\图片30.JPG");
        JLabel imgjla = new JLabel();
        imgjla.setIcon(img);

        // 窗体设置图标
        jf.setIconImage (img.getImage ());

        // 设置尺寸
        Dimension dim = new Dimension ();
        dim.setSize (410,50);

        nameField.setPreferredSize (dim);
        pwdField.setPreferredSize (dim);

        // 把组件加载到窗体上
        jf.add (imgjla);// 显示图片标签

        jf.add (namejla);
        jf.add (nameField);

        jf.add (pwdjla);
        jf.add (pwdField);

        jf.add (btn);

        // 可视化 显示到屏幕上 等窗体加载完组件之后再执行
        jf.setVisible (true);


        // 事件监听器：
        btn.addActionListener (new ActionListener (){// 匿名内部类
            int count=0;
            // 点击按钮才会调用
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println ("点击了按钮"+(count++));
                System.out.println ("账号："+nameField.getText ());
                //System.out.println ("密码："+pwdField.getText ());
            }
        });
    }


}