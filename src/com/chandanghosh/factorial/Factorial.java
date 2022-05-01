package com.chandanghosh.factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = scanner.nextInt();
        System.out.println("factorial in recursion: " + factorial_recursion(n));
        System.out.println("factorial in loop: " + factorial_loop(n));
    }

    private static int factorial_recursion(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number should not be negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial_recursion(n - 1);
    }

    private static int factorial_loop(int n) {
        int i = 1;
        while (n > 0) {
            i *= n;
            n--;
        }
        return i;
    }
}
