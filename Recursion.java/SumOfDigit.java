import java.util.*;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
       int a= sum(n);
       System.out.println(a);
    }
    static int sum(int n){
        if(n==0){
            return 0; 
        }else{
            
            int rem=n%10;
                // sum=sum+rem+sum(n/10,sum);
                return rem+sum(n/10);
                
               }
    }
    
}
