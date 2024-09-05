import java.util.Scanner;

public class fibonachi {
     public static void main(String [] args){
        int a=0;
        int b=1;
        // int sum=a+b;
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(a);
            // System.out.println(b);
            int sum=a+b;
            a=b;
            b=sum;
        }
     }
    
}
