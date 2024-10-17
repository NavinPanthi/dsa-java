package com.prakash;

import java.util.Arrays;

public class VarLengthArgs {
    public static void main(String[] args) {
        fun(3, 4, "tea", "amit", "ram");
    }
    static void fun(int a, int b, String ...v){
        System.out.println(a + "" + b);
        System.out.println(Arrays.toString(v));
    }
}
