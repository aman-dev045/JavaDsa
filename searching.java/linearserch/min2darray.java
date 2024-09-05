import java.util.Arrays;

public class min2darray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int max=arr[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
        var min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(min>arr[i][j]){
                 min=arr[i][j];
                }
            }
        }
        System.out.println(min);
        
    }
    
}
