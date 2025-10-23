import java.util.Scanner;

public class methods {
    public static int int_val(Scanner sc){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(c);
        return c;
    }
    void String_val(Scanner sc){
        String sr = sc.next();
        System.out.println(sr);
    }
    public static void main(String [] args){
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        methods nw = new methods();
        methods.int_val(sc);
        nw.String_val(sc);       
    }
}
