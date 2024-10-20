package com.basic;

import java.util.Scanner;

public class ReverseNumberOrString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse it.");
        String string = sc.nextLine();
        String reverseString = "";
        for(int i = string.length()-1; i>=0; i--){
            String s = string.charAt(i) + "";
            reverseString += s;
        }
        System.out.println("Reverse string is\t" + reverseString);
        System.out.println("Enter the number to reverse it.");
        int number = sc.nextInt();
        int reverseNumber = 0;
        while(number > 0){
            int rem = number%10;
            number = number/10;
            reverseNumber = reverseNumber * 10 + rem;
        }
        System.out.println("Reverse number is\t" + reverseNumber);
    }
}
