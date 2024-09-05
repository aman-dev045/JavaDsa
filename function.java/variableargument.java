import java.util.Arrays;

public class variableargument {
    public static void main(String[] args) {
        fun(2,4,5,4,3,5);//it will gives an array as an output .
        fin(2,3,"aman","nakul","karan");
        demo("aman","karan","manish");
        demo(2,3,4,5,5);
    }
    static void fun(int...v){//intialising variable no. of arguments
        System.out.println(Arrays.toString(v));
    }
    static void fin(int a,int b,String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
