/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.History;
import core.models.Operation;
import core.models.calculator.Add;
import core.models.calculator.Calculator;
import core.models.calculator.Potency;

/**
 *
 * @author lcaba
 */
public class PotencyController {
    public static Response makePower(String a, String b) {
        double aInt, bInt;
        
        try{
            //We verify that the fields are not empty
            if (a.equals("")) {
                return new Response("Number 1 field is empty", Status.BAD_REQUEST);
            }
            
            if (b.equals("")) {
                return new Response("Number 2 field is empty", Status.BAD_REQUEST);
            }
            //We verify that the given numbers are Real numbers
            try {
                aInt = Double.parseDouble(a);
            } catch (NumberFormatException ex) {
                return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
            }
            
            try {
                bInt = Double.parseDouble(b);
            } catch (NumberFormatException ex) {
                return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
            }
            
            History history = History.getInstance();
            Calculator power = new Potency(aInt, bInt);
            history.addOperation(new Operation(power.getA(), power.getB(), "^", power.operation()));
            return new Response("Potency made successfully", Status.OK);
        }catch(Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
