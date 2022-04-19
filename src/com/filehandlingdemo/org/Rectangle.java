package com.filehandlingdemo.org;

public class Rectangle {
    private double length;
    private double width;
    private static  int numRectangle;

    public Rectangle(){
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        numRectangle++;
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double calArea(){
        return length*width;
    }
    public double calPerimeter(){
        return (2*length + 2*width);
    }
}
