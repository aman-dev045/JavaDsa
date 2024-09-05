/**
 * bsearch
 */
public class bsearch {

    public static void main(String[] args) {
        int arr[]={1 ,3 ,6 ,8 ,9};
       int index= bin(arr,0,arr.length,6);
       System.out.println("The Target is found at the index:"+index);

        
    }
    static int bin(int arr[],int low ,int high,int target){
        if(low<=high) {
            int mid=(low +high)/2;
            
        
        if(arr[mid]==target){
        return mid;
         } else if(arr[mid]>target){
                high=mid-1;
                bin(arr, low, high, target);
         }else{
            low=mid+1;
            bin(arr, low, high, target);
         }
}
return -1;
    }
}