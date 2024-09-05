import java.util.*;
// import math.abs;
class prac{
    public static void main(String[] args) {
        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("want to continue press y else n");
            char ch=sc.next().charAt(0);
            if(ch=='y'||ch=='Y'){
                continue;
            }else if(ch=='n'||ch=='N'){
                break;
            }else{
                System.out.println("invalid command");
            }
            
        
        System.out.println("Enter the operation that you want to perform");
       
        char name=sc.next().trim().charAt(0);
        if(name=='+'||name=='-'||name=='*'||name=='/'){
            float a,b;
            a=sc.nextFloat();
            b=sc.nextFloat();
            switch(name){
                case '+':System.out.println(a+b);
                break;
                case '-':System.out.println(a-b);
                break;
                case '*':System.out.println(a*b);
                break;
                case '/':System.out.println(a/b);
                break;
                default:System.out.println("Invalid command");
               
            }
        }
       
    }
}
}