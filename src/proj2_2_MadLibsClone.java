import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adjective1, girl_name, adjective2, occupation, place, clothing, hobby, adjective3, occupation2, boys_name, mans_name;
        System.out.print("Enter and adjective ");
        adjective1 = sc.nextLine();

        System.out.print("Enter a girl name ");
        girl_name = sc.nextLine();

        System.out.print("Enter another adjective: ");
        adjective2 = sc.nextLine();

        System.out.print("Enter an occupation: ");
        occupation = sc.nextLine();

        System.out.print("Enter the name of place: ");
        place = sc.nextLine();

        System.out.print("Enter the name of piece of clothing: ");
        clothing = sc.nextLine();

        System.out.print("Enter the name of hobby: ");
        hobby = sc.nextLine();

        System.out.print("Enter the another adjective: ");
        adjective3 = sc.nextLine();

        System.out.print("Enter another occupation: ");
        occupation2 = sc.nextLine();

        System.out.print("Enter a boy's name: ");
        boys_name = sc.nextLine();

        System.out.print("Enter a man's name: ");
        mans_name = sc.nextLine();

    }

}
