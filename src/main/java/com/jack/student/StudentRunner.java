package com.jack.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = scanner.next();
        System.out.println("Please enter your english :");
        int english = scanner.nextInt();
        System.out.println("Please enter your math :");
        int math = scanner.nextInt();

        Student stu = new Student(name, english, math);
        stu.print(); // 呼叫 print 方法
    }
}
