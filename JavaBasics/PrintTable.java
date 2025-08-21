import java.util.*;
public class PrintTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();
        int result = 0;
        System.out.println("Table of given number is:");
        for(int i=1;i<=10;i++){
            result = num * i;
            System.out.println(" "+num+" * "+i+" = "+ result);
            
        }
    }
    
}
