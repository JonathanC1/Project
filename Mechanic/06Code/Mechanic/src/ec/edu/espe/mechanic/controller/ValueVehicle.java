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
 * @author Sigma Programmers
 */
public class ValueVehicle {
    BasicDBObject document = new BasicDBObject();
    
    public DBObject addVehicle(int year, String Registration, String Plate, String trademark, String model, float mileage ){
    
        document.put( "Year",year );
        document.put( "Registration", Registration);
        document.put( "Plate", Plate);
        document.put( "Trademark",trademark );
        document.put( "Model", model);
        document.put( "Mileage", mileage);
        return null;
    }
    
    
}
