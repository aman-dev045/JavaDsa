import java.util.*;
class linearsearch{
    public static void main(String[] args) {
        int arr[]={3,2,5,4,5,6,7,5};
        int ans=fun(6,arr);
        System.out.println(ans);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    i=j;
                }
            }
            // System.out.println(arr[i]);
        }
        
    }
    static int fun(int a,int arr[]){
       if(arr.length==0){
        return -1;
       }
        for(int i=0;i<arr.length;i++){
            int element =arr[i];
            if(element==a){
                return i;
            }
        }
        
        return -1;
    }
}