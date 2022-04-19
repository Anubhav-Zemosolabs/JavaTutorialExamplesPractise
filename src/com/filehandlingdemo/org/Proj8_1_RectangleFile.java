package com.filehandlingdemo.org;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangle_list = new ArrayList<>();
        fillArrayList(rectangle_list);
        printArrayList(rectangle_list);

    }
        public static void fillArrayList(ArrayList<Rectangle> rectangle_list){
            Scanner infile;
            try {
                Rectangle temp;
                double length;
                double width;

                infile = new Scanner(new File("rectangle_data.txt"));
                while(infile.hasNext()){
                    length = infile.nextDouble();
                    width = infile.nextDouble();
                    temp = new Rectangle(length, width);
                    rectangle_list.add(temp);
                }
                infile.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
        public static void printArrayList(ArrayList<Rectangle> rectangle_list){
                for(Rectangle r: rectangle_list){
                    System.out.println("Length: " + r.getLength());
                    System.out.println("Width: " + r.getWidth());
                    System.out.println("Area of Rectangle: " + r.calArea());
                    System.out.println("Perimeter of Rectangle: " + r.calPerimeter());
                    System.out.println("\n");
                }
        }
}
