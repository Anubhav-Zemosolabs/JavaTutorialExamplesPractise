package com.string_and_stringbuilder_practise.org;

import java.util.Scanner;

public class StringBuilderFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder name = new StringBuilder("Anubhav Gupta");
        System.out.println("Name is: " + name);
        int ind = name.indexOf(" ");
        name.replace(0,ind, "Dr.");
        System.out.println("New Name is: " + name);

    }
}
