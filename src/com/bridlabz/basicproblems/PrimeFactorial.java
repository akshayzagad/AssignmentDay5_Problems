package com.bridlabz.basicproblems;

import java.util.Scanner;

public class PrimeFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            if (checkPrime(i)) {
                while (number % i == 0) {
                    System.out.println(i + " ");
                   number=number/i;
                }
            }
        }
    }

    static boolean checkPrime(int i) {
        int count=0;
        for (int j = 1; j < i; ++j) {
            if (i % j==0) {
                count++;
            }
        }
            if (count==2) {
                return true;
            }
            else {
                return false;
            }
    }
}
