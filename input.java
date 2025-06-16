import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your age");
        num =scanner.nextInt();
        if (num>=18){
            System.out.println(num+ " Your are eligible to vote");
        }
        else{
            int ageGap = 18 - num;
            System.out.println("You are not elegible to vote because you are " + num + " years old, you need more " + ageGap + " years to vote.");
        }
    }
}
