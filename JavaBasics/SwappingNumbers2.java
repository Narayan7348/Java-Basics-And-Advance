import java.util.Scanner;
public class SwappingNumbers2 { //Swapping two numbers without using a third variable
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        a = a + b; 
        b = a - b;
        a = a - b;
        System.out.println("After swapping: ");
        System.out.println("First number: " + a);   
        System.out.println("Second number: " + b);


    }
}
