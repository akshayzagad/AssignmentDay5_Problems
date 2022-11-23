package com.bridlabz.basicproblems;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter yeAR: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        m2(year);
    }

    static void m2(int year) {
        if (year % 100 == 0 && year % 4 == 0 || year % 100 != 0 && year % 4 == 0){
            System.out.println("year is leap year");
        }
        else{
            System.out.println("year is not leap year");
        }

    }
}
