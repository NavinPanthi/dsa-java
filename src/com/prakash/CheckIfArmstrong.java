package com.prakash;

import java.util.Scanner;

public class CheckIfArmstrong {
//    find base^power
    static int powerCalculation(int base, int power){
        int i = 1;
        int ans = 1;
        while(power>=i){
            ans *=  base ;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to check");
        Scanner sc = new Scanner(System.in);
        int tempn = sc.nextInt();
        int n = tempn, tempnumber = n;
        int count = 0;
        //find count of digits in a number.
        {
            while(tempn > 0){
                tempn = tempn/10;
                count++;
            }
        }
        //finding armstrong logic
        int sum = 0;
        {
            while (n > 0) {
                int r = n % 10;
                n = n / 10;
                int ans = powerCalculation(r, count); //x^y
                sum += ans; //x^y + x^y +
            }
        }
        String result = (sum == tempnumber)  ? "Yes" : "No";
        System.out.println(result);
    }
}
