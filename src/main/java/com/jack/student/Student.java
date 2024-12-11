package com.jack.student;

public class Student {
    // 在類別第一層所定義的變數都叫做屬性
    String id;
    String name;
    int english;
    int math;

    // 可使用 Alt + insert 建立建構子
    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    // 建立一個 print 方法
    public void print () {
        System.out.printf("姓名: %s\t英文: %d\t數學: %d\t平均: %.2f%n",
                name, english, math, (english + math) / 2.0);

    }

}