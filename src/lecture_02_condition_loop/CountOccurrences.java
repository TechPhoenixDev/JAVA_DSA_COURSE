package lecture_02_condition_loop;

public class CountOccurrences {
    public static void main(String[] args){
        int n=137477;
        int count =0;
        while (n>0){
            if (n %10 == 7) count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
