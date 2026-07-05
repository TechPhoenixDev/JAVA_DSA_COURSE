package lecture_02_condition_loop;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         /*
         important notes
         input.next() ----> take input of the first word.
         input.nextline()------>take input of entire line .
         charAt(0)------>only take first letter as an input .
         trim()-------> input.next() takes input upto the space(means one word);
                        if any line started with space its just remove it .


                                        practice
             take input p form the word apple
             char ch=sc.next().trim().charAt(1)

                                  char input form string

              String word="hello";
              char ch = word.trim().charAt(0);

         */
        char ch = input.next().trim().charAt(0);

       // System.out.println(ch);

        if(ch >='a' && ch <='z') System.out.println("it is a lower case. ");
        else if(ch >='A' && ch <='Z') System.out.println("it is a upper case charector.");
    }
}
