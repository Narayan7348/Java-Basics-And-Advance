import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum=0 ; int temp1=n;
        int count=0;int mul;
        while(temp1!=0) {
            count++;
            temp1=temp1/10;
        }
        int temp2=n;
        while(temp2!=0) {
            int r = temp2%10;
            mul=1;
            for(int i=1;i<=count;i++) {
                mul=mul*r;
            }
            sum=sum+mul;
            temp2=temp2/10;
        }
        if(sum==n) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not an armstrong number");
        }
    }
}
     
