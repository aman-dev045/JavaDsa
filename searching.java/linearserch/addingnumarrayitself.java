public class addingnumarrayitself {
    public static void main(String[] args) {
        int arr[][]={
            {1 ,2,23},{4,2,1},{3 ,1 ,5}
        };
        // int sum=0;
        int maxarr[]=new int [arr.length];
        for(int i=0;i<3;i++){
           int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            maxarr[i]=sum;
        }
     
        int max=maxarr[0];
        int index=0;
        for(int i=0;i<maxarr.length;i++){
            if(max<maxarr[i]){
                max=maxarr[i];
                index=i;

            }
        }
        System.out.println(index);
    }
}
