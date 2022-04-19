import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i=1; i<=10; i++) {
            int my_number = random.nextInt(6);
            System.out.println("In" + i + " role have got the value: " +  my_number);
        }
    }
}
