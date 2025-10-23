public class array {
    public void array_1D(int [] arr1){
        int n = arr1.length;
        System.out.println("the value of 1D in reverse");
        for(int i = n - 1; i >= 0; i--){
            System.out.println(arr1[i]);
        }
    }
    public void array_2D(int [][] arr2){
        int rows = arr2.length;
        int cols = arr2[0].length; 
        System.out.println("the value of 2D");
        for(int j = 0; j < rows; j++){
            for(int k = 0; k < cols; k++){
                System.out.println(arr2[j][k]);
            }
        }
    }

    public static void main(String [] args){
        int [] arr1 = {1, 2, 3, 4, 5};
        int [][] arr2 = {
            {2, 3, 4},
            {6, 7, 8},
            {9, 3, 4}
        };

        array nw = new array();
        nw.array_1D(arr1);
        nw.array_2D(arr2);
    }
}
