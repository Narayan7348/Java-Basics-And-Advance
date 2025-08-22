import java.util.*;
public class SingleSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum = 0;
        while(n>=10){
            while(n!=0){
                sum += n % 10;
                n /= 10;
            }
            n=sum;
            sum=0;

        }
        System.out.println(n);
    }
    
}
