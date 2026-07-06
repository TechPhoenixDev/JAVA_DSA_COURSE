package lecture_03_switch_case;

import java.util.Scanner;

public class SwitchCase {
   public static void main(String[] args) {
       Scanner Sc=new Scanner(System.in);
       System.out.println("Enter the fruit name: ");
       String fruit =Sc.next();
       switch (fruit){
           case "mango":
               System.out.println("king of fruit ");
               break;

           case "orange":
               System.out.println("Round fruit ");
               break;

           case "apple":
               System.out.println("red fruit ");
               break;

           default:
               System.out.println("pls enter valid name ");
       }
    }
}
