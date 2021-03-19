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
public class ValueUserLogin {
    BasicDBObject document = new BasicDBObject();
    
    public DBObject addUser(String name,String password ){
    
    document.put( "Name",name );
    document.put( "Password", password);
    return null;
    }
}
