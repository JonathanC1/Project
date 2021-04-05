package ec.edu.espe.mechanic.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.DBCursor;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Sigma Programmers
 */
public class MongoDBManager implements DBManager  {
    
    DB dataBase;
    DBCollection collection;
    BasicDBObject mainDocument = new BasicDBObject();

    public boolean openConnection() {
        try {
            System.out.println("\nESTABLISHED CONNECTION");
            
MongoClientURI uri = new MongoClientURI(
    "mongodb+srv://miltoncuji:miltoncuji@televisors.pvtoy.mongodb.net/Televisors?retryWrites=true&w=majority");
MongoClient mongoClient = new MongoClient(uri);

                
            return true;
        } catch (Exception ex) {
            System.out.println("\nCONNECTION REFUSED");
            return false;

        
       
    }
    }

    @Override
    public boolean closeConnection(String connection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean create(String data, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String find(String dataToFind, String field, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(String dataToFind, String newData, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(String dataToFind, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String read(String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean create(String data, String table, BasicDBObject document) {
        openConnection();
        collection = dataBase.getCollection(data);

            collection.insert(document);

            
        return false;
        

    }

    @Override
    public String find(String DataBase, String dataToFind, String field, String table) {
        openConnection();
        collection = dataBase.getCollection(DataBase);

        DBCursor cursor = collection.find();
        String name = "";

        while (cursor.hasNext()) {
            name = "Name: " + cursor.next().get("Name") + "\n";
            return name;
        }
        return null;
    }

    @Override
    public boolean update(String dataBase, String dataToFind, String newData, String field, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String DataBase, String dataToFind, String field, String table) {
        openConnection();
        collection = dataBase.getCollection(DataBase);
        collection.remove(new BasicDBObject().append(table, dataToFind));
        return true;
        

    }

    @Override
    public String read(String dataBase, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
