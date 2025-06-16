public class Fibonacci {

    public static void main(String[] args) {
        int n = 20; // Change this value to compute Fibonacci of a different position
        int a = 0, b = 1, c;

        System.out.println("Fibonacci series up to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}