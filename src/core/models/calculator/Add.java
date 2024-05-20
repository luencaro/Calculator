/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.calculator;

/**
 *
 * @author lcaba
 */
public class Add extends Calculator{

    public Add(double a, double b) {
        super(a, b);
    }
    
    
    @Override
    public double operation() {
        return this.a + this.b;
    }
    
}
