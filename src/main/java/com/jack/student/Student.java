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

    public int highest() {
        // 三元運算式 (boolean) ? A:B

        /*int max = (english > math) ? english : math;
        if(english > math) {
            max = english;
        } else {
            max = math;
        }*/

        return (english > math) ? english : math;
        // return Math.max(english, math); 使用 Math.max 來比較
    }

    // 建立一個 print 方法
    public void print() {
        /*System.out.printf("姓名: %s\t英文: %d\t數學: %d\t平均: %.2f%n",
                name, english, math, (english + math) / 2.0);*/

        int average = getAverage();
        System.out.print(name + "\t" + english + "\t" + math +
                "\t" + getAverage() + "\t" + ((average >= 60) ? "PASS" : "FAILED"));

        char grading = 'F';
        switch (average / 10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println("\t" + grading);

        /*if (average >= 90 && average <= 100) {
            grading = 'A';
        } else if (average >= 80 && average <= 89) {
            grading = 'B';
        } else if (average >= 70 && average <= 79) {
            grading = 'C';
        } else if (average >= 60 && average <= 69) {
            grading = 'D';
        }
        System.out.println(grading);*/

        // 練習 2
        /*if (average >= 90){
            System.out.println("A");
        } else if (average >= 80) {
            System.out.println("B");
        } else if (average >= 70) {
            System.out.println("C");
        } else if (average >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }*/

        /*if (getAverage() >= 60) {
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }*/
    }

    // 建立一個 getAverage 方法
    public int getAverage() {
        return (english + math) / 2;
    }

}