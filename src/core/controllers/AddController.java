/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.History;
import core.models.Operation;
import core.models.calculator.Calculator;
import core.models.calculator.Potency;
import java.text.DecimalFormat;

/**
 *
 * @author lcaba
 */
public class AddController {
    
    public static Response makePower(String a, String b) {
        double aInt, bInt;

        try {
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
            
            if ((a.contains(".") && a.split("\\.")[1].length() > 3) ||
                (b.contains(".") && b.split("\\.")[1].length() > 3)) {
                return new Response("Numbers must have no more than three decimal places", Status.BAD_REQUEST);
            }
            
            History history = History.getInstance();
            Calculator power = new Potency(aInt, bInt);
            double result = power.operation();

            // Formateamos el resultado a tres decimales
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedResult = df.format(result);

            history.addOperation(new Operation(power.getA(), power.getB(), "^", result));
            return new Response("Add made successfully: " + formattedResult, Status.OK);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
