
public class PalindromeNumberRange {
    
    public static void main(String[] args) {
        System.out.println("Palindrome numbers from 1 to 1000 are:");
        for(int num=1;num<=1000;num++){
            int sum = 0,temp;
            temp=num;
           
            while(temp != 0) {
                  //getting remainder
                sum = (sum * 10) + temp % 10;
                temp= temp / 10;
            }
            if(sum==num) {
                System.out.print(num+" ");
            }
        }
    }
}
