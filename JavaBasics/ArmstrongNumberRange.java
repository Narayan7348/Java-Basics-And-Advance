
public class ArmstrongNumberRange {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 1000 are:");
        for(int num=1;num<=1000;num++){
            int sum=0; int temp1=num;
            int count=0;int mul;
            while(temp1!=0) {
                count++;
                temp1=temp1/10;
            }
            int temp2=num;
            while(temp2!=0) {       
                int r = temp2%10;
                mul=1;
                for(int i=1;i<=count;i++) {
                    mul=mul*r;
                }
                sum=sum+mul;
                temp2=temp2/10;
            }
            if(sum==num) {
                System.out.print(num+" ");
            }
        }
    }
}