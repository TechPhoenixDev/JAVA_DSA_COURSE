package lecture_02_condition_loop;

public class ReversingNumber {
    public static void main(String[] args){
        int n=275404;
        int rev = 0;;
        while (n>0){
            int mod = n%10;
            rev = rev*10 + mod;
            n=n/10;
        }
        System.out.println(rev);
    }
}

