package com.mahbub;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number: ");
        int first = input.nextInt();
        System.out.print("enter second number: ");
        float second = input.nextFloat();
        float sum = first + second;
        System.out.println("the sum is "+sum);

    }
}
