import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum = 0,temp;
        temp=n;
       
        while(temp != 0) {
              //getting remainder
            sum = (sum * 10) + temp % 10;
            temp= temp / 10;
        }
        System.out.println(sum);
        if(sum==n) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not a palindrome");
        }
    }
    
}
