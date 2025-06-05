public class min_max {
    public static void meth() {
        int[] arr = {1, 2, 3, 4, 5};

        int min = arr[0];  
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {  
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void main(String[] args) {
        min_max.meth();
    }
}
