import java.util.*;
public class EvenNumber2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number % 2 == 0) {
            System.out.println(number + " is an even number.");
            if(number %3==0) {
                System.out.println(number+" is even number and also divisible by 3");
            }
        }else {
            System.out.println(number + " is not an even number.");
        }
    }
    
}
