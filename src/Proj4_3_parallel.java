import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_parallel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] age_array;
        ArrayList<String> name_array = new ArrayList<>();
        age_array = new int[5];

        for(int i=0; i<5; i++){
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            name_array.add(name);
            System.out.print("Enter age: ");
            age_array[i] = sc.nextInt();
            sc.nextLine();
        }

        for(int i=0; i<5; i++){
            System.out.println(name_array.get(i) + " has age of " + age_array[i] + ". ");
        }
    }
}
