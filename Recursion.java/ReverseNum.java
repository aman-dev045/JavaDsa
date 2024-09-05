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
            return a;
        }else
        {
            //nice method
            int rem=n%10;
            a=(a*10)+rem;
          return  reverse(n/10, a);
            
        }
        
    }
    
}
