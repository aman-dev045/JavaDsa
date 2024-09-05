


public class FindingPeakOfMountainarray {
    public static void main(String[] args) {
        int arr[]={0,1,0};
        int max=peak(arr);
        System.out.println("the max value of an array is:"+max);
        
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
    static int bsearch(int arr[],int low ,int high ,int target){
      
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }

        
        }
        return -1;

    }
}
