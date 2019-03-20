package com.soft1841.list;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.Random;

public class Line {
    public static void main(String[] args) throws IOException {
        //指定图片大小和类型
        BufferedImage bufferedImage = new BufferedImage(1260, 970, BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics graphics = bufferedImage.getGraphics();
        //获取字体
        Font font = new Font("方正克书皇榜体 简", Font.BOLD, 20);
        graphics.setFont(font);
        graphics.setColor(Color.WHITE);
        //绘制一个白色矩形
        graphics.fillRect(0, 0, 1260, 970);
        //生成两个随机点
        Random random = new Random();
        int x1 = random.nextInt(1260);
        int y1 = random.nextInt(970);
        int x2 = random.nextInt(1260);
        int y2 = random.nextInt(970);
        //控制台输出两点
    }
}