package com.filehandlingdemo.org;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circle_list = new ArrayList<>();
        fillArrayList(circle_list);
        printArrayList(circle_list);
    }
    public static void fillArrayList(ArrayList<Circle> circle_list){
        Scanner infile;
        try{
            Circle temp;
            double radius;

            infile = new Scanner(new File("circle_data.txt"));
            while(infile.hasNext()){
                radius = infile.nextDouble();
                temp = new Circle(radius);
                circle_list.add(temp);
            }
            infile.close();
        }
        catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    public static void printArrayList(ArrayList<Circle> circle_list){
        for(Circle r: circle_list){
            System.out.println("radius: " + r.getRadius());
            System.out.println("Area of Circle: " + r.getArea());
            System.out.println("perimeter of Circle: " + r.getPerimeter());
            System.out.println("\n");
        }
    }
}
