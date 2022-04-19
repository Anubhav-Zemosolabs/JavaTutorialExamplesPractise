package com.filehandlingdemo.org;

public class Circle {
    private double radius;
    private static  double num_circle = 1;

    public Circle(){
        this(1);
    }

    public Circle(double radius){
        this.radius = radius;
        num_circle++;
    }
    public void setRadius(){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public double getPerimeter(){
        return 2*3.14*radius;
    }
}
