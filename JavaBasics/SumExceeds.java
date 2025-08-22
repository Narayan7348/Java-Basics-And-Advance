import java.util.*;
public class SumExceeds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num ; int sum = 0;
        do{
            System.out.println("enter the number");
            num = sc.nextInt();
            sum+=num;
        }while(sum<=100);
System.out.println("Sum exceeds 100, final sum is: " + sum);
        
    }
    
}
