// package loops.java;
import java.util.Scanner;

public class countnum {
    public static void main(String[] args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a%10!=0){
            int rem=a%10;
            if(rem==7){
                count++;
            }
            a=a/10;
        }
        System.out.println(count);
    }
    
    
}
