/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanicSystem.utils;


import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

/**
 *
 * @author lucia
 */
public class Operation {
    public static void add (DB db, String name, String Lastname, String Email, string ID){
  
        DBCollection collection = db.getCollection(cashier);
        BasicDBObject document = new BasicDBObject();
        document.put("name", name);
        document.put("Lastname", name);
        document.put("Email", Email);
        document.put("ID", ID);
    
    }
    
    
    
    
    
    
    
    
}
