import java.util.ArrayList;
import java.util.Scanner;
class arraylicg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>(5);
        list.add(new ArrayList<>());
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
    }
}