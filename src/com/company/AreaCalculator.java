package com.company;

public class AreaCalculator {
    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        } else {
            double areaCircle = radius * radius * Math.PI;
            System.out.println("Area of circle with radius " + radius + " is " + areaCircle );
            return areaCircle;
        }
    }

    public static double area(double x, double y){
        if( x < 0 || y < 0){
            return -1.0;
        } else {
            double areaRectangle = x * y;
            System.out.println("Area of rectangle with " + x + y + " is " + areaRectangle);
            return areaRectangle;
        }
    }

}
