/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanicSystem.utils;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoClientURI;
/**
 *
 * @author Sigma Programmers
 */
public class Connection {


ConnectionString connString = new ConnectionString(
    "mongodb+srv://LuciG:<0852luci0852GL>@cluster0.2tjah.mongodb.net/myFirstDatabase?retryWrites=true&w=majority"
);
MongoClientSettings settings = MongoClientSettings.builder()
    .applyConnectionString(connString)
    .retryWrites(true)
    .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("Documents");
}


