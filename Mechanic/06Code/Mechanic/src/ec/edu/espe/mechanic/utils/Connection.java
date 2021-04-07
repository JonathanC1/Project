package ec.edu.espe.mechanic.utils;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author Sigma Programmers
 */
public class Connection {

    public static MongoClient createConnection() {
        try {
            System.out.println("\nESTABLISHED CONNECTION");

            MongoClientURI uri = new MongoClientURI(
                    "mongodb+srv://miltoncuji:miltoncuji@televisors.pvtoy.mongodb.net/Televisors?retryWrites=true&w=majority");
            MongoClient mongoClient = new MongoClient(uri);

            return mongoClient;
        } catch (Exception ex) {
            System.out.println("\nCONNECTION REFUSED");
            return null;
        }
    }
}
