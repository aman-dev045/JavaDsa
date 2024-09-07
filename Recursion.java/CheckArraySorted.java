import java.util.*;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ans = checkarray(arr, 0);
        System.out.println(ans);

    }

    static boolean checkarray(int arr[], int i) {

        if (i >= arr.length - 1) {
            return true;
        }
        if (arr[0] < arr[arr.length - 1]) {
            if (arr[i] <= arr[i + 1]) 
            {
                return checkarray(arr, i+1);
            } 
                else{
                    return false;
                }   
                       
        }
       

        else {
        if (arr[i] >=arr[i + 1]) {
        return checkarray(arr, i+1);
        }
        else{
        return false;
        }
        }

    }

}
