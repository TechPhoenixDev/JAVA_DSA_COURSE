package lecture_02_condition_loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the nth term: ");
        int n= in.nextInt();
        int initial = 0;
        int finalValue = 1 ;
        int i=0;
        System.out.println("the fabonacci series: ");
        while(i<=n){
            System.out.print(initial +" " );
            int next_term=initial+finalValue;
            initial= finalValue;
            finalValue= next_term;
            i++;
        }

    }

}
