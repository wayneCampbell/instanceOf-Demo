/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a-grzegorzewski
 */
public class Rectangle extends Shape {
    
    public Rectangle( double width, double height ) {
        super( width, height );
    }
    
    public double area() {
        return width * height;
    }
    
    public double perimeter() {
        return 2 * ( width + height );
    }
    
    public String toString() {
        return "Rectangle " + width + " by " + height;
    }
}
