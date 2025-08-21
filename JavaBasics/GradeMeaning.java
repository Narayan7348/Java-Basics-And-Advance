import java.util.*;
public class GradeMeaning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your grade(A,B,C,D,E,F): ");
        char grade= sc.next().charAt(0);
        switch(grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Error: Invalid grade. Please enter a valid grade (A-F).");
        }
    }
    
}
