package com.bridlabz.basicproblems;

public class FlipCoin {
    public static void main(String[] args) {
int number=5;
        double percentageOfHead=0;
        double percentageOfTail=0;
        int head=0;
        int tail=0;
        for (int i = 0; i<number;i++) {
            double random1 = ((Math.random()));
            System.out.println("Random number is " + random1);
            if (random1>0.5){
                System.out.println("Head");
                head++;
                System.out.println(head);
            } else {
                System.out.println("Tail");
                tail++;
            }
        }
         percentageOfHead = (head *100) / number;
         percentageOfTail = (tail * 100) / number;
        System.out.println("percentage Of Head "+ percentageOfHead);
        System.out.println("percentage Of Tails "+ percentageOfTail);
    }
}
