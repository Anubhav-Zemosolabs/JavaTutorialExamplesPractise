import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Let's play the game to check divisibility of a number by 3");

        int number;
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        sc.nextLine();

        int temp = number;
        int sum_of_digits = 0;

        while(temp>0){
            sum_of_digits += (temp%10);
            temp = temp/10;
        }

        if(sum_of_digits%3 == 0)
            System.out.println("The number " + number + " is divisible by 3");
        else
            System.out.println("Not divisible by 3");;
    }
}
