import java.util.*;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a Character: ");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(ch + " is a Vowel");
                break;
            default:
                if((ch>='a' &&ch<='z')||(ch>='A' && ch<='Z')) {
                    System.out.println(ch + " is a Consonant");
                } else {
                    System.out.println("Error: Invalid input. Please enter an alphabetic character.");
                }

        }
    }
}