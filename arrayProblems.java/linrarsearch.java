import java.lang.reflect.Array;
import java.util.Scanner;
public class linrarsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        for(int num:arr){
            num=sc.nextInt();
        }
        
        System.out.println("enter the number you want to search:");
        int b=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=b){
                continue;
            }else{
                System.out.println("found it at index no "+i);
                break;

            }
        }
    }
    
}
