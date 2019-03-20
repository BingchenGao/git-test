package com.soft1841.list;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifferentExample {
    public static void main(String[] args) {
        String Time1 = "2019-03-16 9:20:12";
        String Time3 = "2019-03-18 8:40:23";
        String Time4 = "2019-03-18 7:10:15";
        String  Time5 = "2019-03-18 8:43:12";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date curren = new Date();
        String Time2 = format.format(curren);
        Date d1,d2,d3,d4,d5;
        long diff =0;
        long diff1 = 0;
        long diff2 = 0;
        try {
            d1 = format.parse(Time1);
            d2 = format.parse(Time2);
            d3 = format.parse(Time3);
            d4 = format.parse(Time4);
            d5 = format.parse(Time5);
            diff = d2.getTime() - d1.getTime();
            diff1 = d2.getTime() - d3.getTime();
            diff2 = d2.getTime() - d5.getTime();
        }catch (ParseException e){
            e.printStackTrace();
        }
        long diffMinutes = diff2 /(1000 * 60);
        long diffHours = diff1 / (1000 * 60 * 60);
        long diffDays = diff / (1000 * 60 *60 * 24);
        System.out.println("现在时间：" + Time2);
        System.out.println(Time1 +  " " + Math.abs(diffDays) + "天前");
        System.out.println(Time3 + " " + Math.abs(diffHours) + "小时前");
        System.out.println(Time5 + " " + Math.abs(diffMinutes) + "分前");
        System.out.println(Time4 + " " + "刚刚");
    }
}
