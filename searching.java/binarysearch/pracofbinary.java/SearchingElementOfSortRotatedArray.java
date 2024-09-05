public class SearchingElementOfSortRotatedArray {

    public static void main(String[] args) {
        int arr[]={4,5,6,0,1};
        int target=0;
       int ans=findpivot(arr);
     int b=  bsearch(arr, 0, ans, target);
     if(b==-1){
       System.out.println( bsearch(arr, ans+1, arr.length, target));
     }else{
       System.out.println(b);
     }

    }

    static int findpivot(int arr[]) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid>low&&arr[mid] < arr[mid - 1]) {
                return mid - 1;
                
            }if(mid<high &&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(low>mid){
                high=mid-1;
            }else{
                low=mid;
            }
        }
        return -1;
    }

    static int bsearch(int arr[], int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }else if(arr[mid]<target){
                low= mid+1;
            }
        }
        return -1;
    }
}