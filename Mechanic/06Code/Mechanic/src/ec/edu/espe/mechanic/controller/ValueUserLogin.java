package ec.edu.espe.mechanic.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 *
 * @author Sigma Programmers
 */
public class ValueUserLogin {
    BasicDBObject document = new BasicDBObject();
    
    public DBObject addUser(String name,String password ){
        document.put( "Name",name );
        document.put( "Password", password);
        return null;
    }
}
