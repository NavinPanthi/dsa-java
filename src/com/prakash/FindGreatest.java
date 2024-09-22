package com.prakash;

import java.util.Scanner;

class FindGreatest {
    public static void main(String[] args) {
        System.out.println("Enter all three numbers");
        Scanner ainput = new Scanner(System.in);
        int a = ainput.nextInt();
        Scanner binput = new Scanner(System.in);
        int b = binput.nextInt();
        Scanner cinput = new Scanner(System.in);
        int c = cinput.nextInt();
        int g = 0;

        if(a>=b && a>=c){
            g = a;
        }else if (b>=c && b>=a){
            g = b;
        }
        else if (c>=a && c>=b){
            g = c;
        }
        System.out.println("The greatest number is\t" + g);
    }
}
