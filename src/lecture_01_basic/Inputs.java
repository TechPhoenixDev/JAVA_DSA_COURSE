package lecture_01_basic;

import java.util.Scanner;

public class Inputs {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
//        System.out.print("enter your roll no: ");
//        int roll = sc.nextInt();
//        System.out.println("your roll no is "+roll)
//        ;
        String name = sc.nextLine();
        System.out.println(name);

        float marks = sc.nextFloat();
        System.out.println(marks);

    }
}
