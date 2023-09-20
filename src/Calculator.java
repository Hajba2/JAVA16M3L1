import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select action to do:");
        System.out.println("1 -> add");
        System.out.println("2 -> minus");
        System.out.println("3 -> multiply");

        int action = sc.nextInt();

        System.out.println("Enter first number: ");
        int intOne = sc.nextInt();

        System.out.println("Enter second number: ");
        int intTwo = sc.nextInt();

        if (action == 1) {
            System.out.println("result = " + (intOne + intTwo));
        } else if (action == 2) {
            System.out.println("result = " + (intOne - intTwo));
        } else if (action == 3) {
            System.out.println("result = " + (intOne * intTwo));
        } else {
            System.out.println("You had enter incorrect action so you will have no result");
        }

    }
}
