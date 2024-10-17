package com.prakash;

public class Array {
    public static void main(String[] args) {
        int [] arr = new int[5];
        //Primitive variables like x, y, and value are stored in the stack.
        //here new keyword means an arr object is created in heap memory.
        System.out.println(arr[0] + "" + arr[4]); // 00
        String [] arr1 = new String[5]; //here new keyword means an arr object is created in heap memory.
        System.out.println(arr1[0] + "" + arr1[4]); //nullnull

        //null can not be assigned to primitive data type in java.
//        char b = null; //not allowed
//        int n = null; //not allowed

        // null can be assigned to secondary data type.
        String s = null;

    }
}
