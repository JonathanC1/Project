/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 *
 * @author lucia
 */
public class EmployeeController {
    BasicDBObject document = new BasicDBObject();
    
    public DBObject addVehicle(int Name, String LastName, String Phone, String Code ){
    
        document.put( "Name",Name );
        document.put( "LastName", LastName);
        document.put( "Phone", Phone);
        document.put( "Code",Code );
        
        return null;
    }
}
