package com.filehandlingdemo.org;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TwiceData {
    public static void main(String[] args) {
        Scanner infile;
        PrintWriter outfile;

        try{
            infile = new Scanner(new File("nums.txt"));
            outfile = new PrintWriter("TwiceNums.txt");

            int num;
            while(infile.hasNext()){
                num = infile.nextInt();
                outfile.println(num*2);
            }
            infile.close();
            outfile.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
