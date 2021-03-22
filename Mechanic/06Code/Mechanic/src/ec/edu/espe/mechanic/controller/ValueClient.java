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
 * @author ELEN
 */
public class ValueClient {
    BasicDBObject document = new BasicDBObject();
    
     public DBObject addClient(String name, String lastname, String telephoneNumber, String Email,String ID ){
    
    document.put( "Name",name );
    document.put( "lastname ", lastname);
    document.put( "telephoneNumber", telephoneNumber);
    document.put( "Email",Email);
     document.put( "ID",ID);
    return null;
    }
    
}
