package com.methodspractise.org;

public class RecursionDemo {
    public static void main(String[] args) {
        countUp(1, 10);
    }
    public static void countUp(int start, int end){
        if(start<=end){
            System.out.println(start);
            countUp(start + 1, end);
        }
    }
}
