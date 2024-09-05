import java.util.*;
public class fib {
    public static void main(String[] args) {
        int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length of you want:");
        a=sc.nextInt();
        for(int i=0;i<a;i++){
            if(i==0||i==1){
                System.out.println(i);
            }else{
                System.out.println((i-2)+(i-1));
            }

        }
    }
    
}
