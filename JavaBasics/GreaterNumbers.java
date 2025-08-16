import java.util.Scanner;// Program to find the greater of two numbers
public class GreaterNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if(a > b){
            System.out.println("First number is greater: " + a);
        } else if(b > a) {
            System.out.println("Second number is greater: " + b);
        } else {
            System.out.println("Both numbers are equal: " + a);
        }
    }
    
}
