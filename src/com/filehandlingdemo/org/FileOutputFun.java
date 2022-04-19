package com.filehandlingdemo.org;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileOutputFun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            ArrayList<String> array = new ArrayList<>();
            System.out.println("Enter the names");
            for(int i=0; i<5; i++){
                String name ;
                name = sc.nextLine();
                array.add(name);
            }
            PrintWriter pw = new PrintWriter("WritesNames.txt");
            for(String ele: array){
                pw.println(ele);
            }
            pw.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
