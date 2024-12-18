package com.jack.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student.pass = 50;
        Student stu = new Student("Jack", 60, 60);
        Student stu2 = new Student("Hank", 80, 30);
        Student stu3 = new Student("Sean", 70, 50);
        GraduateStudent gstu = new GraduateStudent("Jason", 70, 30, 80);
        gstu.print(); // 因為 GraduateStudent 繼承了 student 方法所以可以使用 print 方法
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score: " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = scanner.next();
        System.out.println("Please enter your english :");
        int english = scanner.nextInt();
        System.out.println("Please enter your math :");
        int math = scanner.nextInt();

        Student stu = new Student(name, english, math);
        stu.print(); // 呼叫 print 方法

        // 呼叫 highest 方法
        // 加號的左邊是字串所以右邊的 highest 也會自動轉為字串
        System.out.println("High score: " + stu.highest());
    }
}
