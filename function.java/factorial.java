import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
        // System.out.println(function());
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for finding factorial:");
        int a=sc.nextInt();

      int n=  factorial(a);
        System.out.println("the factorial of the given number is :"+ n);
        
    }
    // static int function(  ){
    //     int a,b;
    //     a=sc.nextInt();
    //     b=sc.nextInt();
    //     int sum=a+b;
    //     return sum;
    // }
    
    static int factorial(int a){
        if(a==0){
            return 1;
        }
        for(int i=a-1;i>0;i--){
            a=a*i;
        }
        return a;
    }
}