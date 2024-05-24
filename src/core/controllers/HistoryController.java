/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.History;

/**
 *
 * @author Sebastián
 */
public class HistoryController {
    
    public static Response returnHistory(History history) {
        try {
            if(history.getOperations().isEmpty()) {
                return new Response("History is empty", Status.BAD_REQUEST);
            }
            
            return new Response("History retrieved succssesfully: ", Status.OK);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
