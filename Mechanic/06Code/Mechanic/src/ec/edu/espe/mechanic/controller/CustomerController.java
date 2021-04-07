/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 *
 * @author Roberth-C
 */
public class CustomerController {
    
    public static void createcar(MongoClient mongo,String dataBase, String collection,String year, String registration, String plate,String trademark, String model, String mileage)    
          
    {
DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("Year ", year);
        document.put("Registration ", registration);
        document.put("Plate ", plate);
        document.put("Trademark ",trademark);
        document.put("Model ",model);
        document.put("Mileage ",mileage);
        
        dbCollection.insert(document);
        
        
        
    }
    public static void createMotorcycle(MongoClient mongo,String dataBase, String collection,String year, String registration, String plate,String trademark, String model, String mileage)    
          
    {
DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("Year ", year);
        document.put("Registration ", registration);
        document.put("Plate ", plate);
        document.put("Trademark ",trademark);
        document.put("Model ",model);
        document.put("Mileage ",mileage);
        
        dbCollection.insert(document);
        
        
        
    }
    
    
    
    
    
   public static void create(MongoClient mongo,String dataBase, String collection,String name, String lastName, String telephoneNumber,String Email, String ID)    
          
    {
DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("Name", name);
        document.put("LastName", lastName);
        document.put("TelephoneNumber", telephoneNumber);
        document.put("Email ",Email);
        document.put("ID ",ID);
        
        dbCollection.insert(document);
        
        
        
    }
   public static void createUser(MongoClient mongo,String dataBase, String collection,String user, String password)    
          
    {
DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("User", user);
        document.put("Password", password);
        
        
        dbCollection.insert(document);
        
        
        
    } 
  
}
         
     

