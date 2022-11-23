package com.bridlabz.basicproblems;

import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int reasult=1;
        int i =1 ;
        for (i = 1; i<=10; i++){
            reasult= x * i ;
            System.out.println(reasult);
        }
    }
}
