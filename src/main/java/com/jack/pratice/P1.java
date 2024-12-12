package com.jack.pratice;

import java.util.Random;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secret){
            System.out.println("Please enter a number: ");
            number = scanner.nextInt();
            if (number < secret){
                System.out.println("Higher");
            } else if (number > secret) {
                System.out.println("Lower");
            } else {
                System.out.println("Congratulations you win");
            }
        }
    }
}