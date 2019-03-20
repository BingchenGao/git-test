package com.soft1841.constants;

import java.util.Scanner;

public class WeekTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //       String we = scanner.toString();
        System.out.println("请输出一个星期小写：");
        String we = scanner.nextLine();
        Week week = Week.getResult(we);
        System.out.println(week+" --" + week.getWeekName());

    }
}

