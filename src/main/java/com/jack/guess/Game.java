package com.jack.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1; // 如果沒有 +1 只能取得 0-9
//        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        // while迴圈 => 如果為 true 印出 number
        while (number != secret) {
            System.out.print("Please enter a number: ");
            number = scanner.nextInt();
            if (number < secret) {
                System.out.println("Higher");
            }else if (number > secret){
                System.out.println("Lower");
            }else {
                System.out.println("Great, the number is " + number);
            }
        }
        
        System.out.println("-----------");
        // do-while迴圈 => 至少執行一次才結束
        /*int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i < 3);*/
    }
}