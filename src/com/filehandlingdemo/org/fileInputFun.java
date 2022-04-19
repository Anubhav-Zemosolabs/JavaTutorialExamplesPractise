package com.filehandlingdemo.org;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class fileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        try {
            infile = new Scanner(new File("input.txt"));
            int input, sum = 0;
            while (infile.hasNext()) {
                input = infile.nextInt();
                sum += input;
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Can't found file");
            throw new RuntimeException(e);
        }
        catch (InputMismatchException e){
            System.out.println("Error reading input");
            throw new RuntimeException(e);
        }
    }
}
