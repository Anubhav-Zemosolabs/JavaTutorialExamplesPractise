import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> my_list = new ArrayList<>();
        my_list.add("Anubhav");
        my_list.add("Kishan");
        my_list.add("Suraj");

        for(int i=0; i<my_list.size(); i++){
            System.out.println(my_list.get(i));
        }

        for(String a : my_list){
            System.out.println(a);
        }
    }
}
