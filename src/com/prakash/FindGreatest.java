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
        int max;
//one way
        if(a>=b && a>=c){
            g = a;
        }else if (b>=c && b>=a){
            g = b;
        }
        else if (c>=a && c>=b){
            g = c;
        }


        //second way
        if (a>b){
            max = a;
        }
        else {
            max = b;
        }
        if(c>max){
            max = c;
        }

        //Using math.max
        int m = Math.max(Math.max(a,b),c);

        System.out.println("The greatest number is\t" + g);
        System.out.println("max is\t" + max);
        System.out.println("m is\t" + m);
    }
}
