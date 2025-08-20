import java.util.*;
public class PositiveNumber2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();          
        if(number > 0) {
            System.out.println(number + " is a positive number.");
            if(number % 5 == 0) {
                System.out.println(number + " is positive and also divisible by 5");
            }
        } else if(number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
