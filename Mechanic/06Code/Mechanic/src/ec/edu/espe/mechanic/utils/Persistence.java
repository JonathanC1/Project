package ec.edu.espe.mechanic.utils;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Sigma Programers
 */
public interface Persistence {

    boolean create(String data, String table, BasicDBObject document);
    String find(String dataBase, String dataToFind, String field, String table);
    boolean update(String dataBase, String dataToFind, String newData, String field, String table);
    boolean delete(String dataBase, String dataToFind, String field, String table);
    String read(String dataBase, String table);

    public boolean create(String toString, String datatxt);

}