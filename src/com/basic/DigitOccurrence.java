package com.basic;

import java.util.Scanner;

public class DigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from where you want digit occurrence.");
        long number = sc.nextLong();
        System.out.println("Enter the number of which you want digit occurrence");
        int n = sc.nextInt();
        int count = 0;
        while(number > 0){
            long digit = number % 10;
            if(digit == n){
                count++;
            }
            number = number / 10;
        }
        System.out.println("The digit occurrence is\t" + count);
    }
}
