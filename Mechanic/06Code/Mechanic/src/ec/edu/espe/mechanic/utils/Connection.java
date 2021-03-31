/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.utils;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
/**
 *
 * @author Sigma Programmers
 */
public class Connection {

    public static MongoClient createConnection() { try {
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

