import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input character
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        // Switch case to check vowel
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel.");
                break;
            default:
                // Check if alphabet or not
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    System.out.println(ch + " is a Consonant.");
                } else {
                    System.out.println("❌ Invalid input! Please enter an alphabet.");
                }
        }

        sc.close();
    }
}
