package com.bridlabz.basicproblems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the  number: ");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        calculationMethod(n);
    }
    static void calculationMethod(int n){
        int Reasult=1;
        int i = 1;
        for ( i = 1; i<=n ; i++) {
            Reasult = Reasult * i;
        }
        System.out.println( "factorial of given number " + Reasult  );
    }
}
