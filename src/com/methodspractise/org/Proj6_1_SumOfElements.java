package com.methodspractise.org;

import java.util.ArrayList;
import java.util.Random;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        fillElements(array);
        sumOfElements(array);
    }
    public static void fillElements(ArrayList<Integer> arr){
        Random random = new Random(100);
        for(int i=0; i<5; i++){
            int temp = random.nextInt();
            arr.add(temp);
        }
    }
    public static void sumOfElements(ArrayList<Integer> arr){
        int sum = 0;
        for(int ele : arr){
            sum += ele;
        }
        System.out.println(sum);
    }
}
