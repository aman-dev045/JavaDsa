import java.util.*;
import java.math.*;;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = n % 10;
            n = n / 10;
        }

        // int num2=reverse(num, 0);
        // if(num==num2){
        // System.out.println("Yes the number is pallindrome");
        // }else{
        // System.out.println("It is not a pallindrome");

        boolean result = palindro(arr, 0, arr.length - 1);
        System.out.println(result);
    }

    // Method 1:

    // static int reverse(int n,int a){
    // if(n==0){
    // return a;
    // }else
    // {
    // //nice method
    // int rem=n%10;
    // a=(a*10)+rem;
    // return reverse(n/10, a);

    // }
    static boolean palindro(int arr[], int low, int high) {
         if (low == high) {
               
            return true;
        
    }

       
            if (arr[low] == arr[high]) {
                low = low + 1;
                high = high - 1;
             return palindro(arr, low, high);
            }
            else{
                return false;
            }

        
    
    
}
}