package com.jack.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu = new Student("Jack", 79, 79);
        stu.print();
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
