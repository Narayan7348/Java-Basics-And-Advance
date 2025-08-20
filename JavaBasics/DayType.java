import java.util.*;
public class DayType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int day = sc.nextInt();
        if(day>=1 && day<=7){
            System.out.println("it is weeekday");
        } else if(day>=6 && day<=7){
            System.out.println("It's a weekend.");
        } else {
            System.out.println("It's a invalid number.");
        }
    }
    
}
