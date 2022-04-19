package com.string_and_stringbuilder_practise.org;

public class StringMethod1 {
    public static void main(String[] args) {
        String my_name = "Anubhav Gupta";
        String other_name = "Kishan Kumar";
        String my_name2 = "Robert Barathian";

        if(my_name.length()>other_name.length() ){
            System.out.println(my_name + " is greater than " + other_name);
        }
        else if(my_name.length()<other_name.length()) {
            System.out.println(my_name + " is smaller than " + other_name);
        }
        else{
            System.out.println(my_name + " is is equal in length with  " + other_name);
        }
    }
}
