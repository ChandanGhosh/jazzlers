package com.chandanghosh.patterns;

import java.util.Scanner;

/*
    The num of pattern : 5
    '* pattern'
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    'Number pattern'
    1 1 1 1 1
    2 2 2 2 2
    3 3 3 3 3
    4 4 4 4 4
    5 5 5 5 5
*/

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern of num: ");
        int n = sc.nextInt();

        System.out.println("'* pattern'");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("'Number pattern'");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }
}
