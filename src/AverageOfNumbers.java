import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int first, second, third;
            System.out.println("Lets play game of finding the Average of the three numbers");
            System.out.println("Enter the first number");
            first = keyboard.nextInt();
            keyboard.nextLine();

            System.out.println("Enter the second number");
            second = keyboard.nextInt();
            keyboard.nextLine();

            System.out.println("Enter the third number");
            third = keyboard.nextInt();
            keyboard.nextLine();

            float average = (first + second + third)/3;
            System.out.println("The Average of the numbers "+ first + ", " + second + ", " + third + " is " + average );

    }
}
