// package calculator.java;
import java.util.Scanner;

public class calculator {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operation that you want to perform");
        while(true){
            char ch=sc.next().trim().charAt(0);
            if(ch=='+'|| ch=='-'||ch=='*'||ch=='/'||ch=='%'){
                int a=sc.nextInt();
                int b=sc.nextInt();
                // System.out.println("Enter the operation that you want to perform:");
                if(ch=='+'){
                    System.out.println(a+b);
                }
                if(ch=='-'){
                    System.out.println(a-b);
                }
                if(ch=='*'){
                    System.out.println(a*b);
                }
                if(ch=='/'){
                    System.out.println(a/b);
                }
                if(ch=='%'){
                    System.out.println(a%b);
                }
            }
            else{
                System.out.println("invalid operator you have choosed");
                System.out.println("print hello world ");
            }
            System.out.println("want to continue press y or n:");
           char a= sc.next().trim().charAt(0);
           if(a=='y'){
            continue;
           }
           else if(a=='n'){
            break;
           }
           else {
            System.out.println("invalid button choose only in y or n.");
           }

        }
    }
    
}
