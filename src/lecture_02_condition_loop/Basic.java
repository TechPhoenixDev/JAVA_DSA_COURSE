package lecture_02_condition_loop;

public class Basic {
    public static void main(String[] args){
        /*
        if(boolean expression T of F){

        //body
        }else {

        //do this
        }

         */

        int salary =23000;
        if (salary>10000){
            salary +=1000;
        } else {
            salary +=2000;
        }
        System.out.println(salary);
    }
}
