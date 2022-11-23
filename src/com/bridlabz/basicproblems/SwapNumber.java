package com.bridlabz.basicproblems;

import java.util.Scanner;

public class SwapNumber {
        public static void main(String[] args) {
            System.out.println( "Enter the number a:  ");
            System.out.println( "Enter the number b:  ");
            Scanner scanner=new Scanner(System.in);
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            System.out.println("before The swaping" +"  "+ a +" " + "and"+" "  + b);
            m1(a,b);
        }
        static void m1(int a,int b){
            int Temp=a;
            a=b;
            b=Temp;
            System.out.println("After The swaping"+"  "+ a +" " + "and"+" " +  b);
        }
}
