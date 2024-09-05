import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
        System.out.println(a+" "+b); 
        sw(a,b);
        // sa(&a,&b);


        
    }
   static void sw(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
    
}
