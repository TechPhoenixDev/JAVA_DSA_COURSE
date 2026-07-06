package lecture_03_switch_case;

import java.util.Scanner;

public class WeekAnalysis {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("enter day number(1 = monday , sunday = 7 ): ");
        int day = num.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday ");
                break;

            case 6:
            case 7:
                System.out.println("weekend ");
                break;

            default:
                System.out.println("pls enter a valid day (from 1 - 7)");
        }
    }

}
