import java.util.*;
public class coutevennodigit {
public static void main(String[] args) {
    int []arr=new int [5];
    Scanner sc=new Scanner (System.in);
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int count =0;
    int digits=0;
    int rem;
    for(int i=0;i<5;i++){
        while (arr[i]!=0){
           rem= arr[i]%10;
           count++;
           arr[i]=arr[i]/10;

        }
        if(count %2==0){
            digits++;
        }
    }
    System.out.println(digits);

}
}
