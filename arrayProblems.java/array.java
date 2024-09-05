import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int[]arr=new int[5];//decleration of an array and creation of new object
        //array store in stack i.e. complie time but the data inside the array is store in heap memory i.e runtime so it is also known as dynamic memory allocation.
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        for(int num:arr){
            System.out.println(num);
        }
        for(int num:arr){
            num=sc.nextInt();
        }
        for(int num:arr){//for printing each and every element of the array.
            System.out.println(num);
        }
        System.out.println(Arrays.toString(arr));//it will convert the array into string and than print the string having these curly braces and all.
    }
}
