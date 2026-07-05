package lecture_02_condition_loop;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //largest among the 3 number.
        System.out.print("Enter First number:");
        int a=sc.nextInt();

        System.out.print("Enter Second number:");
        int b=sc.nextInt();

        System.out.print("Enter Third number:");
        int c=sc.nextInt();

//        int max= a;
//
//        if(b>max) max=b;
//
//        if(c>max) max=c;

       // int max = Math.max(56,84);

        int max =Math.max(c, Math.max(a,b));//important line

        System.out.println(max);
    }
}