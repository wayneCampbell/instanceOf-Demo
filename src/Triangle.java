/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a-grzegorzewski
 */
public class Triangle extends Shape {
    public Triangle( double width, double height ) {
        super( width, height );
    }
    
    public double area() {
        return 0.5 * width * height;
    }
    
    public double perimeter() {
        return width + height + Math.sqrt(width * width + height * height);
    }
    
    public double getAngle() {
        return 180.0 / Math.PI * Math.atan(height / width);
    }
    
    public String toString() {
        return "Triangle " + width + " by " + height;
    }
}
