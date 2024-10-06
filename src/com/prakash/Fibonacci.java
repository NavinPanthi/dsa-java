//Program to find nth fibonacci number
package com.prakash;

import java.util.Scanner;

public class Fibonacci {
    public static void calculateFibonacci (int n) {
        int a = 0;
        int b = 1;
        int i = 2;
        if(n == 0){
            System.out.println("Please enter positive number");
        }
       else if(n == 1){
            System.out.println("The 1st fibonacci number is 0");
        }
        else if (n == 2){
            System.out.println("The 1st fibonacci number is 1");
        }
        else{
            while(i < n){
                int temp = b;
                b = b + a;
                a = temp;
                i++;
            }
            System.out.println("The\t" + n + "th fibonacci number is\t" + b);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want fibonacci.");
        int n = sc.nextInt();
        calculateFibonacci(n);
    }
}
