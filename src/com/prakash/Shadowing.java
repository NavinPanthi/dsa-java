package com.prakash;

public class Shadowing {
    static int x = 40;

    public static void main(String[] args) {
        System.out.println(x);
        //After the declaration of same variable, the variable at upper scope get shadowed means it is hidden.
        int x;
//        System.out.println(x); we cannot do this because the scope of x starts when it is initialized.
        x = 410;
        System.out.println(x);
    }
}
