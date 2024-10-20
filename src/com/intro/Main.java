package com.intro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
    }
}