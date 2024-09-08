public class patter1 {
    public static void main(String[] args) {
        print(1, 4, 4);

    }

    // static void print(int i,int n){
    // if(i<=n){
    // System.out.print("*");
    // i++;
    // print(i, n);
    // }
    // System.out.println();
    // }
    static void print(int i, int a, int b) {
        if (b != 0) {
            if (i <= a) {
                System.out.print("*");
                i++;
                print(i, a, b);
            } else {
                System.out.println();
                // i=0;
                b--;
                a--;
                print(1, a, b);
            }
        }
    }

}
