import java.util.Arrays;
import java.util.Scanner;
public class array1 {
    public static void main(String [] args){
        int [][] arr = new int [3][3];
        System.out.println("Enter the value");
        Scanner in = new Scanner(System.in);
        for(int row =0; row < arr.length; row++){
            for(int col=0; col <arr.length; col++){
                arr[row][col] = in.nextInt();
            }
        }
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
