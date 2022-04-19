package com.string_and_stringbuilder_practise.org;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String full_name, first_name, last_name;
        System.out.print("Enter Your Full Name: ");
        full_name = sc.nextLine();
        int first_name_index = full_name.indexOf(" ");
        first_name = full_name.substring(0,first_name_index);
        last_name = full_name.substring(first_name_index + 1);
        System.out.println("FUll Name: " + full_name);
        System.out.println("First Name: " + first_name);
        System.out.println("Last Name: " + last_name);
    }
}
