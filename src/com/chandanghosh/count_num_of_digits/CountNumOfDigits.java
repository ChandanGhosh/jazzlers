package com.chandanghosh.count_num_of_digits;

import java.util.Scanner;

public class CountNumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int a = scanner.nextInt();
        int numOfDigits = 0;
        if (a == 0) {
            System.out.println("Invalid number. Enter a bigger number");
            System.exit(1);
        }
        while (a > 0) {
            a = a / 10;
            numOfDigits++;
        }

        System.out.printf("The number of digits in the given number is %d", numOfDigits);
    }
}
