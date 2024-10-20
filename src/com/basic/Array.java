package com.basic;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] arr = new int[5];
        //Primitive variables like x, y, and value are stored in the stack.
        //here new keyword means an arr object is created in heap memory.
        System.out.println(arr[0] + "" + arr[4]); // 00
        String [] arr1 = new String[5];
        System.out.println(arr1[0] + "" + arr1[4]); //nullnull

        //null can not be assigned to primitive data type in java.
//        char b = null; //not allowed
//        int n = null; //not allowed

        // null can be assigned to secondary data type.
        String s = null;

        //Input string as array
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            arr1[i] = sc.next();
        }
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i] + "\t");
        }
        for (String string : arr1) {
            System.out.print(string + "\t");
        }
    }
}
