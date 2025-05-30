import java.util.*;
public class scanner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        scn.nextLine();
        String b = scn.nextLine();
        double c = scn.nextDouble();
        System.out.println("int val:"+a);
        System.out.println("int val:"+b);
        System.out.println("int val:"+c);
        scn.close();
    }
}
