/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.utils;

/**
 *
 * @author Sigma Programmers
 */
public abstract class SQLDBManager implements DBManager{
   public abstract  boolean testConnection(String connection);
}
