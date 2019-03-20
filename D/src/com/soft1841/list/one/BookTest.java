package com.soft1841.list.one;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1,"《西游记》", "50.4"));
        list.add(new Book(2, "《水浒传》", "62.3"));
        list.add(new Book(3, "《三国演义》",  "45.9"));
        System.out.println(list);
        list.add(2,new Book(4, "《红楼梦》", "55.6"));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(2, new Book(5, "《Java》", "35.0"));
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(new Book(4, "《老人与海》", "32.0"));
        System.out.println(list);
        System.out.println(list.indexOf("《汤姆索亚历险记》"));
        System.out.println(list.lastIndexOf("《红楼梦》"));
    }
}
