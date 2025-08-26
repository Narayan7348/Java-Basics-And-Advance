import java.util.Scanner;
public class UnitDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum=0; int temp1=n;
        while(n>=10){
            while(temp1!=0) {
                int r = temp1%10;
                sum=sum+r;
                temp1=temp1/10;
            }
            n=sum;
            sum=0;
        }
        System.out.println("unit digit is "+n);
    }
  
}


