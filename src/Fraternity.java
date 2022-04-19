import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        char gender;

        System.out.println("Enter your present age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your gender M or F: ");
        gender = sc.next().charAt(0);

        if(gender == 'M' && age >= 19){
            System.out.println("You are eligible to join the fraternity");
        }
        else{
            System.out.println("You are not eligible to join fraternity");
        }
    }
}
