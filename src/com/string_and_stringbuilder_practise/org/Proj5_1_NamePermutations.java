package com.string_and_stringbuilder_practise.org;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String full_name, f_name, l_name;
        ArrayList<String> first_name = new ArrayList<>();
        ArrayList<String> last_name = new ArrayList<>();

        for(int i=0; i<5; i++){
            System.out.print("Enter the name:\t");
            full_name = sc.nextLine();
            int ind = full_name.indexOf(" ");
            f_name = full_name.substring(0, ind);
            l_name = full_name.substring(ind + 1);
            first_name.add(f_name);
            last_name.add(l_name);
        }

        System.out.println("Name Permutations");
        for(int i=0; i<first_name.size(); i++){
            for(int j=0; j<last_name.size(); j++){
                System.out.println(first_name.get(i) + " " + last_name.get(j));
            }
        }
    }
}
