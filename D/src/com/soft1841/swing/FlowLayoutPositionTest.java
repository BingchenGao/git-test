package com.soft1841.swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPositionTest extends JFrame {
    public FlowLayoutPositionTest() {
        setTitle("本窗口使用流布局管理器");
        Container c = getContentPane();
        setLayout(new GridLayout(5, 1, 5, 5));
        c.add(new JButton("下面四句诗，哪一句是描写夏天的？"));
        c.add(new JButton("A.秋风萧瑟天气凉，草木摇荡霜为雪"));
        c.add(new JButton("B.白雪纷纷何所似，撒盐空中差可拟"));
        c.add(new JButton("C.接天莲叶无穷碧，映日荷花别样红"));
        c.add(new JButton("D.竹外挑花三两枝，春江水暖鸭先知"));
        setResizable(false);
        setSize(600,500);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutPositionTest();
    }
}
