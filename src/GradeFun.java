import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;

        System.out.println("Enter your grade: ");
        grade = sc.next().charAt(0);

        switch (grade){
            case 'A':
            case 'a':
                System.out.println("great job");
                break;
            case 'B':
            case 'b':
                System.out.println("good job");
                break;
            case 'C':
            case 'c':
                System.out.println("Well Done!");
                break;
            case 'D':
            case 'd':
                System.out.println("Close to failure");
                break;
            case 'F':
            case 'f':
                System.out.println("You are failing in the academics");
                break;
            default:
                System.out.println("You have given invalid grade");
                break;
        }
    }
}
