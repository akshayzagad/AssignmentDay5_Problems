package com.bridlabz.basicproblems;

import java.util.Scanner;

public class EvenOrOdd {
     void method2(int x){
        System.out.println(x);
        if(x%2 == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        EvenOrOdd Object=new EvenOrOdd();
        Object.method2(x);

    }
}
