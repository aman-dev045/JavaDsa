import java.util.Scanner;
public class fibonachii{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
          System.out.println(fib(i));  
        }

     
}
static int fib(int a){
    if(a==0||a==1){
        return a;
     }else{
        return fib(a-2)+fib(a-1);//In this step the recursion is taking place ...
        
     }
}
}