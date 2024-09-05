import java.util.*;
public class CountNoOfZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
      int ans=  counts(n,0);
      System.out.println(ans);
        
    }
    static int counts(int n ,int count){
        if(n==0){
            return 1;
        }else if(n%10==n){
            return count;
        }
        
            if(n%10==0){
                count++;
                 return counts(n/10,count);
            }else{
                n=n/10;
                return counts(n,count);
            }
        
        
    }
}
