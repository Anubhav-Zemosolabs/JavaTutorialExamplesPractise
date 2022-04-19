import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ourGuess;
        int computerNumber;
        int guessCount = 0;
        Random random = new Random();
        boolean guessNumber = false;

        computerNumber = random.nextInt(100) + 1;

        while(!guessNumber) {

            System.out.println("Enter Your Guess: ");
            ourGuess = sc.nextInt();

            if(ourGuess >= 1 && ourGuess <= 100) {

                if (ourGuess == computerNumber) {
                    System.out.println("You gave chosen right number");
                    guessNumber=true;
                }
                else if (ourGuess < computerNumber) {
                    System.out.println("You have chosen too low value");
                }
                else{
                    System.out.println("You have chosen too high value");
                }
            }
            else{
                System.out.println("You have guessed the number out of range");
                System.out.println("Pick some other number between 1 and 100");
            }
        }
    }
}
