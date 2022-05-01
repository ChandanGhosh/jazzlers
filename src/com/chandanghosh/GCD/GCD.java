package com.chandanghosh.GCD;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two num: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int min = Math.min(a, b);
        int ans = 1;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }

        System.out.printf("GCD of %d and %d is %d \n", a, b, ans);
    }
}
