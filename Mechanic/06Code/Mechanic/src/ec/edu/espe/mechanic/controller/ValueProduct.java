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
public class ValueProduct {
    BasicDBObject document = new BasicDBObject();
    
    public DBObject addProduct(String name, int quanty, int price ){
        document.put( "Name",name );
        document.put( "Quanty", quanty);
        document.put( "Price", price);
        return null;
    }
}
