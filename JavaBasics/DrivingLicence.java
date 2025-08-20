import java.util.*;
public class DrivingLicence {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("do you have a driving licence? (yes/no): ");
        String hasLicence = sc.next();
        if (age >= 18 && hasLicence=="yes") {
            System.out.println("You are eligible to drive.");
        } else if (age < 18) {
            System.out.println("You are not old enough to drive.");
        } else if (hasLicence != "yes") {
            System.out.println("You need a driving licence to drive.");
        }
         else {
            System.out.println("You do not have a driving licence.");
        }
   } 
}
