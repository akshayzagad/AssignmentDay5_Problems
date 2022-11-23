package com.bridlabz.basicproblems;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {;
        System.out.println("enter the n1: ");
        System.out.println("enter the n2: ");
        System.out.println("enter the n3: ");
        System.out.println("enter the n4: ");
        System.out.println("enter the n5: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();

        m2(n1,n2,n3,n4,n5);
    }


    static void m2(int n1, int n2, int n3, int n4, int n5) {
        if (n1  > n5) {
            System.out.println("n1 is greater");
        } else if (n2 > n5) {
            System.out.println("n2 is greater");
        } else if (n3 > n5) {
            System.out.println("n3 is greater");
        } else if (n4 > n5) {
            System.out.println("n4 is greater");
        } else {
            System.out.println("n5 is greater");
        }
    }
}

