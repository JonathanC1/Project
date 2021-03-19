/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.utils;

import com.mongodb.DB;
/**
 *
 * @author Sigma Programmers
 */
public class Connection {
  
public static void main(String[]args) {
        
        com.mongodb.MongoClient mongo = connection("mongodb+srv://Jonathan:Jonathan.13@mechanicsystem.1uvae.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
       
        // SI NO EXISTE LA BASE DE DATOS LA CREAMOS
        if(mongo != null) {
            DB db = mongo.getDB("MechanicSystem");   
        }  
        
        Input(mongo.getDB("MechanicSystem"),"Data","Jonathan","L12");
        InputClient(DB db, String coleccion, String name, String lastname, String telephoneNumber, String email, String ci)
    }
}


