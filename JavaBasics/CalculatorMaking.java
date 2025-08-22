import java.util.*;

public class CalculatorMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        int choice;

        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter number 1: ");
                num1 = sc.nextInt();
                System.out.print("Enter number 2: ");
                num2 = sc.nextInt();
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println    ("Cannot divide by zero.");
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 5);
    }
}
