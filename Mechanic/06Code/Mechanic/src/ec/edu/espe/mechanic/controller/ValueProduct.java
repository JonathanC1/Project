package ec.edu.espe.mechanic.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 *
 * @author Sigma Programmers
 */
public class ValueProduct {

    BasicDBObject document = new BasicDBObject();

    public DBObject addProduct(String name, int quanty, int price) {
        document.put("Name", name);
        document.put("Quanty", quanty);
        document.put("Price", price);
        return null;
    }
}
