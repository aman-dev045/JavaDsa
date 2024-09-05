

import java.util.Arrays;

public class findingrange {
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,9};
    int target=8;
    int brr[]={ceiling(arr, target) +1,floor(arr, target)-1};
    System.out.println(Arrays.toString(brr));

    }
    static int ceiling(int arr[],int target){
        int low=0;
        int high=arr.length;
        if(arr[arr.length]<target){
            return -1;
        }
        
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;

            }else if(arr[mid]<target){
                low=mid+1;
            }
        }
        return low;
    }
    static int floor(int arr[],int target){
        int low=0;
        int high=arr.length;
        if(arr[0]>target){
            return -1;
        }
        
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;

            }else if(arr[mid]<target){
                low=mid+1;
            }
        }
        return high;
    }
}

