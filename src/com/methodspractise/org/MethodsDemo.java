package com.methodspractise.org;

public class MethodsDemo {
    public static void main(String[] args){
        double squareValue;
    }
    double getSquare(double side){
        double square = side * side;
        return square;
    }

    void printValue(){
        System.out.println("The vale of square of " + " is: " + getSquare(4));
    }
}
