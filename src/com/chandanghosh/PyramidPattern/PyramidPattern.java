package com.chandanghosh.PyramidPattern;

/*
find the 5th number in the sequence where the numbers are increasing in a sequence of 2. So here
         1, 3, 5, 7, 9. So the 5th num is 9. The formula is based on Arithmetic progression. nth num = a + (n-1)*d
         where a is the first number and n is the nth num to find and d is the difference of each num in sequence which is
         2 here.

         So for drawing a pyramid pattern of 5, we need to fist find the 5th num which will the 1+(5-1)*2 = 9
         So the final row will have 9 stars. The pattern will look like below:
            *
           ***
          *****
         *******
        *********

*/

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of pattern to draw: ");
        int n = sc.nextInt();

        int nthNumb = 1 + (n - 1) * 2;
        int midNum = nthNumb / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nthNumb; j++) {
                if (j >= (midNum - i) && j <= (midNum + i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
