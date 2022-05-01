package com.chandanghosh.table_of_number;

import java.util.Scanner;

public class TableOfNumber {
    /*
    INPUT 3
    OUTPUT (TABLE OF 3 for 10 times): 3 6 9 12 15 18 21 24 27 30
    INPUT 5
    OUTPUT (TABLE OF 5 for 10 times): 5 10 15 20 25 30 35 40 45 50
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scanner.nextInt();
        System.out.println("Enter the iteration :");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(a * i + " ");
        }
        System.out.println();
    }
}
