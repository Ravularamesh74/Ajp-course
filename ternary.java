public class ternary {
    public static void main(String[] args) {
        int num1 = 150;
        int num2 = 300;
        int num3 = 120;
        int max = num1 > num2 ? num1 : num2;
        int maxx = max > num3 ? max : num3;
        System.out.println(maxx);
        //System.out.println(max);
    }
}