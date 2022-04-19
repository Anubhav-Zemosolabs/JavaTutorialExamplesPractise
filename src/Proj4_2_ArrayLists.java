import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> my_list = new ArrayList<>();

        while(true){
            System.out.print("Enter the element: ");
            int ele = sc.nextInt();
            if(ele<0)
                break;
            my_list.add(ele);
        }

        for(int x: my_list){
            System.out.println(x);
        }
    }
}
