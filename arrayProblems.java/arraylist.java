import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        ArrayList<Integer>list=new ArrayList<>(10);
        // list.add(5);
        // list.add(4);
        // list.add(3);
        // list.add(2);
        // // list.get(0);
        // for(int i=0;i<list.size();i++){

        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();
        // list.set(0,9);
        // for(int i=0;i<list.size();i++){

        //     System.out.print(list.get(i)+" ");
            
        // }
       
        for(int i=0;i<list.size();i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    
}
