import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i=1;
        while(true){
            int val;
            System.out.print("Enter the " + i + " number:");
            val = sc.nextInt();
            sc.nextLine();

            if(val<0) {
                break;
            }

            sum += val;
            i++;
        }
        System.out.println("The sum of positive integers is: " + sum);
    }
}
