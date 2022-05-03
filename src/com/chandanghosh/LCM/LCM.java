package com.chandanghosh.LCM;

import java.util.Scanner;
// Least common multiple of two numbers
public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to find LCM of:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = Math.max(a, b);
        int y = a * b;
        int ans = max;

        for (int i = max; i <= y; i++) {
            if (i % a == 0 && i % b == 0) {
                max = i;
                break;
            }
        }

        System.out.printf("LCM of %d and %d is %d\n", a, b, max);
    }
}
