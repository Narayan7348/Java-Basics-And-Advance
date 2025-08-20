import java.util.*;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        System.out.print("Enter the marks of physics:");
        int physics = sc.nextInt();
        System.out.print("Enter the marks of chemistry:");
        int chemistry = sc.nextInt();
        System.out.print("Enter the marks of mathematics:");
        int mathematics = sc.nextInt();
        System.out.print("Enter the marks of biology:");
        int biology = sc.nextInt();
        System.out.print("Enter the marks of computer science:");
        int computerScience = sc.nextInt();
        int totalMarks=physics + chemistry + mathematics + biology + computerScience;
        double percentage=(totalMarks*100/numSubjects);
        System.out.println(percentage);
        if(percentage>=60){
            System.out.println("You have passed with first division.");
        } else if(percentage>=50 && percentage<60){
            System.out.println("You have passed with second division.");
        } else if(percentage>=40 && percentage<50){
            System.out.println("You have passed with third division.");
        } else {
            System.out.println("You have failed.");
        }
    }
    
}
