package ec.edu.espe.mechanic.controller;

import ec.edu.espe.mechanic.model.USTax;

/**
 *
 * @author Sigma Programmers
 */
public class IvaCalculator {
   public static float calculate(float value){
        float total;
        USTax tax = USTax.getlnstance(value);
        total = tax.salesTotal(tax);
      
        return total;
    } 
}
