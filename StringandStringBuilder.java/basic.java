/**
 * basic
 */
public class basic {

    public static void main(String[] args) {

        String name="kunnal";//allocation of the string

        //string is class in kunnal is a object which is stored in heap memory in string pool
        //string are immutable

        String  n="kunnal";
        System.out.println(n);

     //so when two different string have same object i.e they both are pointing to single objects
     //so when we compare both strings then it will gives us true
     //when we have to change the object in a string than we cannot change because string is immutable so we creat a new object and assign to it.

//comparision

     System.out.println(name==n);
     //now creating new object
     n="aman";
     System.out.println(n);

     //creating two different obj of same name explicitly

     String a=new String("aman");
     String b=new String("aman");
     System.out.println(a==b);

     //here we have creatd two new objects of same name
     //in this it will create object outside the string pool but inside the heap as it is a object.

        //method for comparing values of  string 
        System.out.println(a.equals(b));

        //note
        float num=123.45995f;//it also round off
        // System.out.printf("%.2f",num);
        System.out.printf("%.3f",Math.PI);


        //important thing
        String series="";
        for(int i=0;i<27;i++)
{
    char ch=(char)('a'+i);
    System.out.println(ch);
    series=series+ch;

}
System.out.println(series);   
 }
}