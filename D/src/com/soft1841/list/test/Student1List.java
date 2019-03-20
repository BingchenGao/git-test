package com.soft1841.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student1List {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(1,"张三", 85));
        list.add(new Student1(2,"李四", 89));
        list.add(new Student1(3,"刘武", 91));
        Collections.sort(list);
        for(Student1 student1 : list) {
            System.out.println("编号：" + student1.getId() + ",姓名:" + student1.getName() + ",成绩:" + student1.getSuccess());
        }

    }
}
