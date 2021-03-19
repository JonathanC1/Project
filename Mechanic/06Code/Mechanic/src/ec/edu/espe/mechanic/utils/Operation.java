/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.utils;


import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.util.Scanner;

/**
 *
 * @author sigma programers 
 */
public class Operation {

    //Create a new document
    public static void create(MongoClient mongo, String dataBase, String collection, String name, String lastname,
            String email,  String ID) {

        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();
        if (dataBase.equals("Person")) {
            document.put("name", name);
            document.put("lastname", lastname);
            document.put("email", email);
            document.put("id", ID);
        } else {
            document.put("name", name);
            document.put("lastname", lastname);
            document.put("email", email);
            document.put("id", ID);
        }
        dbCollection.insert(document);
    }

    public static void showAll(MongoClient mongo, String dataBase, String collection) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        DBCursor cursor = dbCollection.find();

        while (cursor.hasNext()) {
            if (collection.equals("Person")) {
                System.out.println(cursor.next().get("id") + "  " + cursor.curr().get("name") + "  "
                        + cursor.curr().get("lastname") + "  " + cursor.curr().get("email"));
            } else {
                System.out.println(cursor.next().get("name") + "  " + cursor.curr().get("lastname") + "  "
                        + cursor.curr().get("email") + "  " + cursor.curr().get("ID"));
            }
        }
    }

    public static void findName(MongoClient mongo, String dataBase, String collection, String name) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject query = new BasicDBObject();
        query.put("name", name);

        DBCursor cursor = dbCollection.find(query);
        while (cursor.hasNext()) {
            if (collection.equals("person")) {
                System.out.println(cursor.next().get("id") + "  " + cursor.curr().get("name") + "  "
                        + cursor.curr().get("lastname") + "  " + cursor.curr().get("email"));
            } else {
                System.out.println(cursor.next().get("name") + "  " + cursor.curr().get("lastname") + "  "
                        + cursor.curr().get("email") + "  " + cursor.curr().get("ID"));
            }
        }
    }

    public static void update(MongoClient mongo, String dataBase, String collection, String data) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        Scanner input = new Scanner(System.in);
        String newName = "";

        BasicDBObject searchedName = new BasicDBObject();
        searchedName.append("name", data);

        System.out.print("Enter new Name: ");
        newName = input.nextLine();
        BasicDBObject updateData = new BasicDBObject();
        updateData.append("$set", new BasicDBObject().append("name", newName));
        dbCollection.updateMulti(searchedName, updateData);
    }

    //Delete a name in the documents
    public static void delete(MongoClient mongo, String dataBase, String collection, String name) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        dbCollection.remove(new BasicDBObject().append("name", name));
    }
}
    
   
