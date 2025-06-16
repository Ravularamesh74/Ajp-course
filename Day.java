import java.util.Scanner;

public class Day {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number: ");
        int num = sc.nextInt();

        String day = switch (num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "enter a valid day number";
        };
        System.out.println(day);
        System.out.println("Switch case completed");
    }
}
