

public class SearchingInMountianarry {

    public static void main(String[] args) {
        int arr[]={0,1,2,5,3,2,1};
        int max=peak(arr);
        
    }
    static int peak(int arr[]){
        int start =0;
        int end=arr.length;
        while(start!=end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }

        }
        return arr[start];
}
}