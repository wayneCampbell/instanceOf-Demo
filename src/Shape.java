/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a-grzegorzewski
 */
public abstract class Shape {
    // protected used to allow for direct access from subclass
    protected double width;
    protected double height;
    
    public Shape( double width, double height ) {
        this.width = width;
        this.height = height;
    }
    
    public abstract double area();
    public abstract double perimeter();
}
