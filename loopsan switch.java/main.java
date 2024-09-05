import java.util.Scanner;//used for taking an input..
public class main {

    public static void main(String[] args) {
        System.out.println("my name is aman purohit");//used for printing the output
        Scanner name=new Scanner(System.in);//scanning an object for taking an input..
        // name.nextLine();
        System.out.println(name.nextLine());//nextline used for taking a string as an input
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();//storing an input into in variable

        System.out.println("the value of a is"+a);
        int num=(int)(23.32);//explict typecasting conversion
        System.out.println(num);

    }
}