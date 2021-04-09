package ec.edu.espe.mechanic.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 *
 * @author Sigma Programmers
 */
public class EmployeeController {

    BasicDBObject document = new BasicDBObject();

    public DBObject addVehicle(int Name, String LastName, String Phone, String Code) {

        document.put("Name", Name);
        document.put("LastName", LastName);
        document.put("Phone", Phone);
        document.put("Code", Code);

        return null;
    }
}
