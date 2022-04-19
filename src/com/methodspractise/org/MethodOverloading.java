package com.methodspractise.org;

public class MethodOverloading {
    public static void main(String[] args) {
        getResult(5, 12);
        getResult(5, "12");

    }
    public static void getResult(int a, int b){
        System.out.println(a + " " + b);
    }

    public static  void getResult(int a, String b){
        System.out.println(Integer.toString(a) + " " +  Integer.parseInt(b));
    }
}
