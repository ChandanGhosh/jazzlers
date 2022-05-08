package com.chandanghosh.FindAllDivisors;

// Find all divisor of a number. For example if the number is 15 then all divisors are 1, 3, 5, 15

import java.util.Scanner;

public class FindAllDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        int a = scanner.nextInt();

        System.out.println("All divisors are: ");
        findAllDivisorsInNaiveWay(a);
        System.out.println();
        System.out.println("All divisors (sqrtOfN) are: ");
        findAllDivisorsInSquareRootOfN(a);

    }

    private static void findAllDivisorsInNaiveWay(int a) {
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(" " + i);
            }
        }
    }

    private static void findAllDivisorsInSquareRootOfN(int a) {
        // We can reduce the loop iteration by SQRT of n because
        int sqrtOfN = (int) Math.sqrt(a);
        int i;
        for (i = 1; i <= sqrtOfN; i++) {
            if (a % i == 0) {
                System.out.print(" " + i);
            }
        }
        for (; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(" " + i);
            }
        }
    }
}
