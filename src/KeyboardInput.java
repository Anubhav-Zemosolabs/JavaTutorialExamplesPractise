import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name, city;
        int age, brothers;

        System.out.println("Whats your name!");
        name = keyboard.nextLine();

        System.out.println("Whats your age?");
        age = keyboard.nextInt();
        keyboard.nextLine(); //consume the next line

        System.out.println("How many brothers you have?");
        brothers = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Where do you live?");
        city=keyboard.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your have " + brothers + " brothers");
        System.out.println("You are living in city " + city);
    }
}
