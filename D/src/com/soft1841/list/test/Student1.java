package com.soft1841.list.test;

public class Student1 implements Comparable<Student1> {
    private Integer id;
    private String name;
    private Integer success;

    public Student1(Integer id, String name, Integer success) {
        this.id = id;
        this.name = name;
        this.success = success;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    @Override
    public int compareTo(Student1 student1) {
        return this.getSuccess() - student1.getSuccess();
    }
}
