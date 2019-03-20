package com.soft1841.list;

import java.util.ArrayList;
import java.util.List;

public class Testone {
    public static void main(String[] args) {
        System.out.println("------NBA历史十大巨星------\n");
        String titles[] = {"球员", "绰号", "得分", "篮板", "助攻"};
        for (int i = 0; i < titles.length; i++) {
            System.out.print(titles[i] + "\t");
        }
        System.out.println();
        List<String> list = new ArrayList<>();
        list.add("乔丹  飞人/神  30.1  6.2  5.3");
        list.add("拉塞尔  指环王  15.1  22.5  4.3");
        list.add("贾巴尔  天钩  24.6  11.2  3.6");
        for (int i = 0; i < list.size(); i++) {
            String element = (String) list.get(i);
            String info[] = element.split(",");
            for (int j = 0; j < info.length; j++) {
                System.out.println(info[j] + "\t");
            }
            System.out.println();
        }

    }
}
