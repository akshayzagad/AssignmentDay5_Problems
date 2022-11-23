package com.bridlabz.functionalprogramme;

import java.util.Scanner;

public class Array2DMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Column = scanner.nextInt();
        int Row = scanner.nextInt();
        int[][] Array = new int[Row][Column];
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                Array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                Array[i][j]=Array[i][j]*Array[i][j+1];
                System.out.println(Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
