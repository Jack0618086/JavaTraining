package com.jack.pratice;

import java.util.Random;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        // 1+10 練習
        /*int sum = 0;
        for (int i=0; i<=10; i++) {
            sum += i;
        }
        System.out.println(sum);*/

        Scanner scanner = new Scanner(System.in);
        int secret = new Random().nextInt(100)+1;
        System.out.println(secret);
        for (int i=1; i<=10; i++) {
            System.out.println("Enter number : ("+ i + "/10)");
            int number = scanner.nextInt();
            System.out.println("第 " + i + " 次 : " + number);
            if (number > secret) {
                System.out.println("Lower");
            } else if (number < secret) {
                System.out.println("Higher");
            } else {
                System.out.println("Win");
                break;
            }
        }
            System.out.println("Finish");
    }
}
