import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        for(int i=0; i<5; i++){
            System.out.print("enter the element: ");
            arr[i] = sc.nextInt();
        }

        for(int ele : arr){
            System.out.println(ele);
        }
    }
}
