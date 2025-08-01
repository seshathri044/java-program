public class LCMandGCD {
    // Method to find GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a, int b) {
        int gcd = findGCD(a, b);  // reuse the GCD method
        return (a * b) / gcd;
    }
    public static void main(String[] args) {
        int a = 10, b = 8;
        int lcm = findLCM(a, b);
        int gcd = findGCD(a, b);

        System.out.println("The value of LCM: " + lcm);
        System.out.println("The value of GCD: " + gcd);
    }
}


