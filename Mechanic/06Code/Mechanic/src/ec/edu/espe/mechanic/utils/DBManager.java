/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.utils;

/**
 *
 * @author sigma programers
 */
public interface DBManager extends Persistence {
   
    boolean openConnection(String URL);
    boolean closeConnection(String connection);
    
}
