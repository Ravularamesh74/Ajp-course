import java.util.Scanner;

public class results{
    public static void main(String args[]) {
        int result = 0;
        boolean isPromoted = false;
        System.out.print("Enter marks in 5 subjects: ");
        boolean allPassed = true;
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                int marks = sc.nextInt();
                result += marks;
                if (marks < 35) {
                    allPassed = false;
            }
            if (allPassed) {
                isPromoted = true;
            }
            if (isPromoted) {
                System.out.println("You are promoted to the next class.");
            } else {
                System.out.println("You are not promoted to the next class.");
            }
            System.out.println("Total marks: " + result);
        }
    }
    }
}