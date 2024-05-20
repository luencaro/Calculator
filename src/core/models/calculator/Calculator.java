/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.calculator;

/**
 *
 * @author edangulo
 */
public abstract class Calculator implements Calculation{
    
    protected double a;
    protected double b;
    
    
    
    
//    public double add(double a, double b) {
//        return a + b;
//    }
//    
//    public double subtract(double a, double b) {
//        return a - b;
//    }
//    
//    public double multiply(double a, double b) {
//        return a * b;
//    }
//    
//    public double divide(double a, double b) {
//        return a / b;
//    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
}
