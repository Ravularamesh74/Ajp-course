public class forloop {
    // class body goes here
    public static void main(String[] args) {
        int num = 7; // Change this value to compute factorial of a different number
        //7!= 7*6*5*4*3*2*1
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i; // factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}