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
 * @author sigma programers
 */
public class ValueVehicle {
    BasicDBObject document = new BasicDBObject();
    
    public DBObject addVehicle(int year, String Registration, String Plate, String trademark, String model, float mileage ){
    
    document.put( "year",year );
    document.put( "Registration", Registration);
    document.put( "Plate", Plate);
    document.put( "trademark",trademark );
    document.put( "model", model);
    document.put( "mileage", mileage);
    return null;
    }
    
    
}
