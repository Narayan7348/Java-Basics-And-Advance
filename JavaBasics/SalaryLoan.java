import java.util.*;
public class SalaryLoan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your salary: ");
        int salary=sc.nextInt();
        int minSalary=30000;
        if(salary >= minSalary) {
            System.out.println("You are eligible for the loan.");
        } else {
            System.out.println("You are not eligible for the loan.");
        }
    }
}
