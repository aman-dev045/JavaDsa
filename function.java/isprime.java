import java.util.Scanner;
public class isprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the number that you want to check:");
        int n=sc.nextInt();
     boolean ans=   isprim(n);
     System.out.println(ans);
    }
    static boolean isprim(int n){
        if(n<=1){
            return false;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
               
            }
            return true;
        }
    }
};
