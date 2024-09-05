// package arrayProblems.java;
import java.util.Scanner;
public class passingfunction {
    public static void main(String[] args) {
       int []arr={2,3,4,5,5};
        // System.out.println(Arrays.toString(arr));
        changarr(arr);
        for(int num:arr){
            System.out.println(num);
        }

    }
    static void changarr(int arr []){
        Scanner sc=new Scanner(System.in);
            for(int num:arr){
                num=sc.nextInt();
                
            }
    }
}
