/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.calculator;

/**
 *
 * @author lcaba
 */
public class Potency extends Calculator{

    public Potency(double a, double b) {
        super(a, b);
    }

    @Override
    public double operation() {
       return Math.pow(this.a, this.b);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
}
