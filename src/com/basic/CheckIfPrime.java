package com.basic;

import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String[] args) {
        System.out.println("Enter the number to check.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, count=0;
        for(i=1; i<=n; i++){
           if(n%i == 0){
               count++;
           }
        }
        if(count == 2){
            System.out.println("The number\t" + n + "\tis prime.");
        }
        else{
            System.out.println("The number\t" + n + "\tis not prime.");
        }
    }
}
