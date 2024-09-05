import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a=reverse(n,0);
        System.out.println(a);
    }
    static int reverse(int n,int a){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        a=(rem*10)+a;
        reverse(n/10, a);
        
    }
    
}
