/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

import core.models.Operation;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class History {
    private static History instance; //Singleton instance
    private ArrayList<Operation> operations; //History atribute

    private History() {
        this.operations = new ArrayList<>();
    }
    
    //Getters
    public static History getInstance() {
        if (instance == null) {
            instance = new History();
        }
        return instance;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }
    
    //Since we want to save operations from the most recent, we treat our history as an stack with the LIFO rule    
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }
}
