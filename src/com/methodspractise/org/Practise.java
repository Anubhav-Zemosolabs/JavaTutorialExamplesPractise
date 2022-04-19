package com.methodspractise.org;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0]=64;
        arr[1]=58;
        arr[2]=45;
        arr[3]=87;
        arr[4]=96;

        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length; i++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
//        Arrays.sort(arr);
        for(int a: arr){
            System.out.println(a);
        }
    }
}
