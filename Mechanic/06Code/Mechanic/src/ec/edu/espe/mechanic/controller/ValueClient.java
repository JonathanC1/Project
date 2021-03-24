/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.controller;

import ec.edu.espe.mechanic.model.Customer;
import ec.edu.espe.mechanic.utils.FileManager;
import ec.edu.espe.mechanic.utils.Persistence;
import javax.swing.JOptionPane;



/**
 *
 * @author ELEN
 */
public class ValueClient {
   
     public boolean create(Customer customer){
        boolean created = false;
        String personData;
        
        Persistence persistence;

        
        persistence = new FileManager();
        
        if (persistence.save(customer.toString(),"Data.txt" )){
           JOptionPane.showMessageDialog(null, customer + "was saved");
        }  
       return created;
    }
}
