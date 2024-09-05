// package pracofbinary.java;
import java.util.*;
class smallestchargreaterthantarget{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    char arr[]={'a','b','c'};
    char target='b';
    char ans=fun(arr,target);
    System.out.println(ans);
    //printing the smallest number greater than the target where the array is sorted.
    }

    static char fun(char arr[],char target){
        int low=0;
        int high=arr.length-1;
        if(arr[arr.length]<=target||arr[0]>target){
            return arr[0];
        }
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
             if(arr[mid]>target){
                high=mid -1;
            }else if(arr[mid]<target){
                low =mid+1;
            }
        }
        return arr[low%arr.length];
    }
}