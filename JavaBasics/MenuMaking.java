import java.util.*;

public class MenuMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            
            System.out.println("Menu:");
            System.out.println("1. Hello User");
            System.out.println("2. How are you");
            System.out.println("3. Where are you going");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();  

            if (choice == 1) {
                System.out.println("Hello User");
            } else if (choice == 2) {
                System.out.println("How are you");
            } else if (choice == 3) {
                System.out.println("Where are you going");
            } else if (choice == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice. Try again!");
            }
            
            System.out.println(); 
        } while (choice != 4);

       
    }
}
